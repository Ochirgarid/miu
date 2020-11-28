package prob2A;

class Student {
    private String name;
    private GradeReport gradeReport;

    public Student(String name, String grade) {
        this.name = name;
        this.gradeReport = new GradeReport(this, grade);
    }

    public String getName() {
        return this.name;
    }

    public void printGradeReport() {
        System.out.println(this.gradeReport.getGrade());
    }

    public GradeReport getGradeReport() {
        return this.gradeReport;
    }
}
