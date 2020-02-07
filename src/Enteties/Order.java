package Enteties;

public class Order {
	private String name;
	private double price;
	private int quantity;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Order(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	public double subTotal() {
		return price * quantity;
	}
	public String toString() {
		return String.format("%n") + name + ", " + String.format("%.2f", price) + ", Quantity: " + quantity + ", Subtotal: " + String.format("%.2f", subTotal());
	}

	

}

