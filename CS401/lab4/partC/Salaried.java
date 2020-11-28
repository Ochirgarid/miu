package partC;

public class Salaried extends Employee{
    private double salary;
    Salaried(int empId, double s){
        super(empId);
        salary = s;
    }

    @Override
    public double calcGrossPay(int month, int year) {
        return this.salary;
    }
}
