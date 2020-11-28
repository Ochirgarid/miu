package prob2;

import java.util.ArrayList;

public class Building {

	private int maintenanceCost;
	
	private ArrayList <Apartment> apts;
	
	public Building(int i) {
		// TODO Auto-generated constructor stub
		this.maintenanceCost = i;
		this.apts = new ArrayList<Apartment>();
	}
	
	public void addApartment(Apartment a) {
		this.apts.add(a);
	}
	
	public int getProfit() {
		int profit = 0;
		for(Apartment a: this.apts) {
			profit += a.getRent();
		}
		profit -= this.maintenanceCost;
		return profit;
	}
}
