package Entities;

public class ImportedProduct extends Product{
	private double customFee;
	
	public ImportedProduct() {
		super();
	}
	public ImportedProduct(String name, double price, double customFee) {
		super(name, price);
		this.customFee = customFee;
	}
	public double getCustomFee() {
		return customFee;
	}
	public void setCustomFee(double customFee) {
		this.customFee = customFee;
	}
	public double totalPrice() {
		return getPrice() + customFee;
	}
	@Override
	public final String priceTag() {
		return "$ " + totalPrice();
	}
	@Override
	public final String toString() {
		return super.toString() + "(Customs fee: $ " + customFee + ")";
	}
}
