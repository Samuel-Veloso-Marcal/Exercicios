package Program;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Entities.Product;
import Entities.ImportedProduct;
import Entities.UsedProduct;

public class Executable {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();
		List<Product> products = new ArrayList<Product>();
		for (int i=1; i>=n; i++) {
			System.out.printf("Product #%d data:%n Common, used or imported (c/u/i)? ", i);
			char decision = sc.nextLine().charAt(0);
			if (decision != 'i' && decision != 'c' && decision != 'u') {
				System.out.print("Repeat (c/u/i): ");
				decision = sc.nextLine().charAt(0);
			}
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Price: ");
			double price = sc.nextDouble();
			if (decision == 'c') {
				products.add(e)
			}
		}
	}
}