package partC;

import java.util.ArrayList;
import partC.Order;

public class Commissioned extends Employee {
    private ArrayList <Order> orders;
    private double commission;
    private double baseSalary;

    Commissioned(int empId, double commission, double baseSalary) {
        super(empId);
        this.commission = commission;
        this.baseSalary = baseSalary;
        this.orders = new ArrayList<Order>();
    }

    @Override
    public double calcGrossPay(int month, int year) {
        return this.baseSalary + (this.commission * this.getOrderAmount(month, year));
    }
    
    public void addOrder(Order o) {
        this.orders.add(o);
    }
    
    public int getOrderAmount(int month, int year) {
        int totalAmount = 0;
        for(Order o : orders) {
            if(o.checkYearMonth(year, month)) {
                totalAmount += o.getOrderAmount();
            }
        }
        return totalAmount;
    }
}
