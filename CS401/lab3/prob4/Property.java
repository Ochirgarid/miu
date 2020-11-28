package prob4;

public class Property {
	protected String address;
	protected double rent;
	Property (double c) {
		this.rent = c;
	}
	public double computeRent() {
		return this.rent;
	};
}
