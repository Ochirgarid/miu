package prob4;

public class House extends Property{
	private int lot;
	House (int l) {
		super(0.1);
		this.lot = l;
	}
	
	@Override
	public double computeRent() {
		return this.rent * this.lot;
	};
}
