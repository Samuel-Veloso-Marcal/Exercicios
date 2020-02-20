package Program;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import Entities.ImportedProduct;
import Entities.Product;
import Entities.UsedProduct;

public class Executable {
	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();
		List<Product> products = new ArrayList<Product>();
		char decision;
		double price;
		String name;
		Date manufactureDate;
		double customFee;
		SimpleDateFormat sdft = new SimpleDateFormat("dd/MM/yyyy");
		for (int i=1; i<=n; i++) {
			System.out.printf("Product #%d data:%nCommon, used or imported (c/u/i)? ", i);
			decision = sc.next().charAt(0);
			if (decision != 'i' && decision != 'c' && decision != 'u') {
				System.out.print("Repeat (c/u/i): ");
				decision = sc.next().charAt(0);
			}
			sc.nextLine();
			System.out.print("Name: ");
			name = sc.nextLine();
			System.out.print("Price: ");
			price = sc.nextDouble();
			if (decision == 'c') {
				products.add(new Product(name, price));
			}
			if (decision == 'u') {
				System.out.print("Manufature date (DD/MM/YY): ");
				manufactureDate = sdft.parse(sc.next());
				products.add(new UsedProduct(name, price, manufactureDate));
			}
			if (decision == 'i') {
				System.out.print("Customs fee: ");
				customFee = sc.nextDouble();
				products.add(new ImportedProduct(name, price, customFee));
			}
		}
		System.out.printf("%nPrice Tags:");
		for (Product x : products) {
			System.out.println(x);
		}
	}
}