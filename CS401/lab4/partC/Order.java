package partC;

import java.util.Calendar;

public class Order {
    private int orderNo;
    private Calendar orderDate;
    private int orderAmount;
    Order (int n, Calendar d, int a) {
        orderNo = n;
        orderDate = d;
        orderAmount = a;
    }

    public boolean checkYearMonth(int year, int month) {
        if(orderDate.get(Calendar.YEAR) == year && (orderDate.get(Calendar.MONTH) + 1) == month) {
            return true;
        }
        return false;

    }

    public void setOrderNo(int n) {
        this.orderNo = n;
    }
    public void setOrderAmount(int a) {
        this.orderAmount = a;
    }
    public void setOrderDate(Calendar d) {
        this.orderDate = d;
    }

    public int getOrderNo() {
        return this.orderNo;
    }
    public int getOrderAmount() {
        return this.orderAmount;
    }
    public Calendar getOrderDate() {
        return this.orderDate;
    }
}
