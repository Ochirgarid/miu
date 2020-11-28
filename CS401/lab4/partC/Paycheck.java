package partC;

public class Paycheck {
    private final double grossPay;
    private final double fica;
    private final double state;
    private final double local;
    private final double medicare;
    private final double socialSecurity;
    public Paycheck(double pay) {
        fica = 23.0;
        state = 5.0;
        local = 1.0;
        medicare = 3.0;
        socialSecurity = 7.5;
        grossPay = pay;
    }
    public void print() {
        System.out.println("Gross pay:" + grossPay);
    }

    public double getNetPay() {
        double total_tax = fica + state + local + medicare + socialSecurity;
        return grossPay * ((100.0 - total_tax) / 100.0);
    }
}
