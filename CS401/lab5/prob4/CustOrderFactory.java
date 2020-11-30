package prob4;

import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

final public class CustOrderFactory {

	private CustOrderFactory() {
	}

	public static CustomerAndOrder createCustomerAndOrder(String custName, List <LocalDate> orderDates) {
        Customer c = new Customer(custName);
        List <Order> o = new ArrayList<Order>();
		for(LocalDate d: orderDates) {
            Order tmp = new Order(d);
            c.addOrder(tmp);
        }
		return new CustomerAndOrder(c, o);
	}
}

