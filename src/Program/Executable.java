package Program;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import Enteties.Client;
import Enteties.Order;

public class Executable {
	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdft = new SimpleDateFormat("dd/MM/yyyy");
		System.out.printf("Enter client data:%nName: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Birth date (DD/MM/YYYY): ");
		Date birth = sdft.parse(sc.nextLine());
		Client client = new Client(name, email, birth);
		System.out.print("How many orders do you want? ");
		int n = sc.nextInt();
		client.addOrders(n);
		
		sc.close();
	}
}
