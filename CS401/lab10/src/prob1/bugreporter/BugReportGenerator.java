package prob1.bugreporter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

import prob1.classfinder.ClassFinder;

/**
 * This class scans the package prob2.javapackage
 * for classes with annotation @BugReport. It then generates a bug report
 * bugreport.txt, formatted like this:
 * 
 * Joe Smith
 *     reportedBy:
 *     classname:
 *     description:
 *     severity:
 *     
 *     reportedBy:
 *     classname:
 *     description:
 *     severity:
 *     
 * Tom Jones
 *     reportedBy:
 *     classname:
 *     description:
 *     severity:
 *     
 *     reportedBy:
 *     classname:
 *     description:
 *     severity:
 * 
 *
 */
public class BugReportGenerator {
	private static final Logger LOG = Logger.getLogger(BugReportGenerator.class.getName());
	private static final String PACKAGE_TO_SCAN = "prob1.javapackage";
	private static final String REPORT_NAME = "bug_report.txt";
	private static final String REPORTED_BY = "reportedBy: ";
	private static final String CLASS_NAME = "classname: ";
	private static final String DESCRIPTION = "description: ";
	private static final String SEVERITY = "severity: ";
	public void reportGenerator() {
		List<Class<?>> classes = ClassFinder.find(PACKAGE_TO_SCAN);
		classes.forEach(cl -> System.out.println(cl.getName()));

		//sample code for reading annotations -- you will need to change
		//this quite a bit to solve the problem
		//Sample code below obtains a list of names of developers assigned to bugs
		List<String> names = new ArrayList<String>();
		
		class Bug{
			int severity;
			String description;
			String reportedBy;
			String className;
			Bug(int s, String d, String r, String c) {
				severity = s;
				description = d;
				reportedBy = r;
				className = c;
			}

			@Override
			public String toString() {
				return "  " + REPORTED_BY + reportedBy + "\n  " +
					CLASS_NAME + className +  "\n  " +
					DESCRIPTION + description +  "\n  " +
					SEVERITY + Integer.toString(severity) + "\n";
			}
		}

		Map <String, List<Bug> > reports = new HashMap<String, List<Bug> >();

		for(Class<?> cl : classes) {
			if(cl.isAnnotationPresent(BugReport.class)) {
				BugReport annotation = (BugReport)cl.getAnnotation(BugReport.class);
				String name = annotation.assignedTo();
				int severity = annotation.severity();
				String description = annotation.description();
				String reportedBy = annotation.reportedBy();

				if(!names.contains(name)){
					names.add(name);
				}

				Bug b = new Bug(severity, description, reportedBy, cl.getName());
				if(!reports.containsKey(name)) {
					reports.put(name, new ArrayList<Bug>());
				}
				reports.get(name).add(b);
			}
		}
		
		names.sort(Comparator.reverseOrder());


		try (PrintWriter printWriter = new PrintWriter(new FileWriter(REPORT_NAME))) {
			for(String name: names){
				printWriter.println(name);
				reports.get(name).stream()
				.sorted(Comparator.comparing((Bug x) -> x.severity))
				.map(x -> x.toString())
				.forEach(printWriter::println);
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
		
	}
	
	
}
