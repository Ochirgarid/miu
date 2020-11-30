package edu.mum.cs.cs401.examples.lesson05.factorymethods6.studreport;

//Immutable relative to its package studreport
final class StudentAndReportImpl implements StudentAndReport {
	private Student student;
	private GradeReport report;

	StudentAndReportImpl(Student s, GradeReport g) {
		student = s;
		report = g;
	}

	public Student getStudent() {
		return student;
	}

	public GradeReport getReport() {
		return report;
	}
}