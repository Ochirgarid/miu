package partC;

public abstract class Employee {
    private int empId;
    public Employee(int eid) {
        empId = eid;
    }
    public void print(){
        System.out.println("emp id:" + empId);
    };
    public Paycheck calcCompensation(int month, int year){
        Paycheck compensation = new Paycheck(calcGrossPay(month, year));
        return compensation;
    };
    public abstract double calcGrossPay(int month, int year);
}
