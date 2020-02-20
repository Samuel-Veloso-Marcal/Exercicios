package Entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product{
	private Date manufactureDate;
	
	public UsedProduct() {
		super();
	}
	public UsedProduct(String name, double price, Date manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}
	public Date getManufactureDate() {
		return manufactureDate;
	}
	public String getManufactureDateString() {
		SimpleDateFormat sdft = new SimpleDateFormat("dd/MM/yyyy");
		return sdft.format(manufactureDate);
	}
	public void setManufactureDate(Date manufactureDate) {
		this.manufactureDate = manufactureDate;
	}
	@Override
	public final String priceTag() {
		return "(used) $ " + getPrice(); 
	}
	@Override
	public final String toString() {
		return super.toString() + "(Manafacture date : " + getManufactureDateString() + ")";
	}
}
