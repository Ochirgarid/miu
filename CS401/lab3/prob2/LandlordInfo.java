package prob2;

import java.util.ArrayList;

public class LandlordInfo {

	private ArrayList <Building> blds;
	
	LandlordInfo() {
		this.blds = new ArrayList <Building>();
	}
	
	public void addBuilding(Building b) {
		// TODO Auto-generated method stub
		this.blds.add(b);
	}

	public int calcProfits() {
		// TODO Auto-generated method stub
		int profit = 0;
		for(Building b: this.blds) {
			profit += b.getProfit();
		}
		return profit;
	}

}
