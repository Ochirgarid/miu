package edu.mum.cs.cs401.examples.lesson06.javafx.tables;

public class ShoppingCart {
	private String itemName;
	private String quantity;
	private String price;

	// private String totalPrice;
	public ShoppingCart() {
		// do nothing
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getTotalPrice() {
		return (new Double(Integer.parseInt(quantity) * Double.parseDouble(price))).toString();
	}

	public String toString() {
		return itemName + ", " + quantity + ", " + price;
	}
	// public void setTotalPrice(String totalPrice) {
	// this.totalPrice = totalPrice;
	// }

}
