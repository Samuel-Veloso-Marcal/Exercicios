package Program;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import Enteties.Client;
import Enteties.Order;
import Enteties.enums.Enumeration;

public class Executable {
	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdft = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdft2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		System.out.printf("Enter client data:%nName: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Birth date (DD/MM/YYYY): ");
		Date birth = sdft.parse(sc.nextLine());
		Client client = new Client(name, email, birth);
		System.out.print("What is the stage of the orders? ");
		Enumeration enun = Enumeration.valueOf(sc.nextLine());
		System.out.print("How many orders do you want? ");
		int n = sc.nextInt(); 
		client.addOrders(n);
		System.out.printf("ORDER SUMMARY:%nOrder moment: ");
		System.out.println(sdft2.format(new Date(System.currentTimeMillis())));
		System.out.print("Order status: ");
		System.out.println(enun);
		System.out.print("Client: ");
		System.out.println(client);
		System.out.print("Order items:");
		double summ = 0;
		for (Order x: client.getOrders()) {
			System.out.print(x);
			summ += x.subTotal();
		}
		System.out.println();
		System.out.print("Total: ");
		System.out.println(summ);
		sc.close();
	}
}
