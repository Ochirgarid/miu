package edu.mum.cs.cs401.examples.lesson05.factorymethods6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import edu.mum.cs.cs401.examples.lesson05.factorymethods6.otherpackage.DataRecord;
import edu.mum.cs.cs401.examples.lesson05.factorymethods6.otherpackage.Database;
import edu.mum.cs.cs401.examples.lesson05.factorymethods6.studreport.GradeReport;
import edu.mum.cs.cs401.examples.lesson05.factorymethods6.studreport.StudentAndReport;
import edu.mum.cs.cs401.examples.lesson05.factorymethods6.studreport.StudentGradeReportFactory;

public class Main {

	public static void main(String[] args) {
		// two setters
		printTopStudents();

	}

	public static void printTopStudents() {
		Collection<DataRecord> data = Database.h.values();
		List<GradeReport> reports = new ArrayList<>();
		for (DataRecord d : data) {
			StudentAndReport sr = StudentGradeReportFactory.createStudentAndReport(d.getName(), d.getGrade());
			reports.add(sr.getReport());
		}

		Collections.sort(reports);
		Iterator<GradeReport> it = reports.iterator();
		System.out.println("A Students:");
		GradeReport next = null;
		while ((next = it.next()) != null && next.getGrade().equals("A")) {
			System.out.print(next.getStudent().getName() + " ");
		}
	}

}
