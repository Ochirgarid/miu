package prob2A;

class GradeReport {
    private Student owner;
    private String grade;

    public GradeReport(Student owner, String grade) {
        this.owner = owner;
        this.grade = grade;
    }

    public void printStudentName() {
        System.out.println(this.owner.getName());
    }

    public String getGrade() {
        return this.grade;
    }

}