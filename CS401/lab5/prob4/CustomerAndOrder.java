package prob4;

import java.util.List;

public class CustomerAndOrder {

	private Customer cust;
	private List <Order> orders;

	CustomerAndOrder(Customer cust, List <Order> orders) {
		this.cust = cust;
		this.orders = orders;
	}

	public Customer getCustomer() {
		return cust;
	}

	public List <Order> getReport() {
		return orders;
	}
}
