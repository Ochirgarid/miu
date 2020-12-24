package exercise9_5;

public class ExamData {
    private String studentName;
    private double testScore;
    public ExamData(String name, double score) {
        studentName = name;
        testScore = score;
    }
    public double getScore(){
        return testScore;
    }
}
