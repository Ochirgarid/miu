package prob2A;

class Main {
    public static void main(String[] args) {
        Student s = new Student("Ochirgarid Chinzorig", "A");
        System.out.println("Printing grade:");
        s.printGradeReport();
        System.out.println("Printing Student name:");
        GradeReport g = s.getGradeReport();
        g.printStudentName();
    }
}
