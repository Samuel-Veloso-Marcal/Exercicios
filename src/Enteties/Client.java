package Enteties;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Client {
	private Scanner sc = new Scanner(System.in);
	private String name;
	private String email;
	private Date birth;
	private List<Order> orders = new ArrayList<>();
	
	public Client(String name, String email, Date birth) {
		this.name = name;
		this.email = email;
		this.birth = birth;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getBirth() {
		return birth;
	}
	public void setBirth(Date birth) {
		this.birth = birth;
	}
	public List<Order> getOrders() {
		return orders;
	}
	public void addOrders(int n) {
		for (int i=1; i<=n; i++) {
			System.out.printf("Enter #%d item data:%nProduct name: ", i);
			if(i>1) {
			sc.nextLine();
			}
			String name = sc.nextLine();
			System.out.printf("Product price: ");
			double price = sc.nextDouble();
			System.out.print("Quantity: ");
			int quantity = sc.nextInt();
			System.out.println();
			this.orders.add(new Order(name, price, quantity));
		}
	}
	

	
	
	
}

