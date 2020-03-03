package Program;

import java.util.Scanner;

import Entities.exeptions.Main;
import Entities.Account;
public class Executable {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			try {
			System.out.printf("Enter account data%nNumber: ");
			int number = sc.nextInt();
			System.out.print("Holder: ");
			sc.next();
			String Holder = sc.nextLine();
			System.out.print("Initial balance: ");
			double balance = sc.nextDouble();
			System.out.print("Withdraw limit: ");
			double withdrawLimit = sc.nextDouble();
			System.out.println();
			Account x  = new Account(number, Holder, balance, withdrawLimit);
			System.out.print("Enter amount for withdraw: ");
			double amount = sc.nextDouble();
			x.withdraw(amount);
			System.out.println("New balance: " + x.getBalance());
			}
			catch (Main e) {
				System.out.println("Fatal error: " + e);
			}
			finally{
				sc.close();
			}
		}
	}


