package prob4;

public class Condo extends Property{
	private int floor;
	Condo (int f) {
		super(400.0);
		this.floor = f;
	}
	
	@Override
	public double computeRent() {
		return this.rent * this.floor;
	};
}
