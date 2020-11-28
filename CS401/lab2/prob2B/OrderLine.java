package prob2B;

import prob2B.Order;

public class OrderLine {
	private Order myOrder;
	private String orderName;

	public OrderLine(Order order, String item) {
		this.orderName = item;
		this.myOrder = order;
	}

	public String getItem() {
		return this.orderName;
	}

	public void printOrderInfo() {
		System.out.println(this.myOrder.getOrderNum());
	}

	public void printOrderLineInfo() {
		System.out.println(this.orderName);
	}
}
