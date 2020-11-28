package prob2B;

import java.util.ArrayList;
import prob2B.OrderLine;

public class Order {
    private int orderNum;
    private ArrayList <OrderLine> lines;
    
    public Order(int no) {
    	this.orderNum = no;
    	this.lines = new ArrayList <OrderLine>(); 
    }
    
	public void printTotalOrderLines() {
		System.out.println(this.lines.size());
	}
	public int getOrderNum() {
		return this.orderNum;
	}
	public ArrayList <OrderLine> getOrderLines() {
		return this.lines;
	}
	public void printAllOrderLines() {
		for(OrderLine o: this.lines) {
			o.printOrderLineInfo();
		}
		
	}
	public void orderNewLine(String item) {
		OrderLine tmp = new OrderLine(this, item);
		this.lines.add(tmp);
	}
}
