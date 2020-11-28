package partC;

public class Hourly extends Employee{
    private double hourlyWage;
    private int hoursPerWeek;
    Hourly (int eid, double wage, int hr) {
        super(eid);
        hourlyWage = wage;
        hoursPerWeek = hr;
    }

    @Override
    public double calcGrossPay(int month, int year) {
        return hourlyWage * hoursPerWeek * 4;
    }
    

}
