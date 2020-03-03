package Entities;
import Entities.exeptions.Main;
public class Account {
	private int number;
	private String Holder;
	private double balance;
	private double withdrawLimit;
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getHolder() {
		return Holder;
	}
	public void setHolder(String holder) {
		Holder = holder;
	}
	public double getBalance() {
		return balance;
	}
	public double getWithdrawLimit() {
		return withdrawLimit;
	}
	public void setWithdrawLimit(double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}
	public void deposit(double amount) {
		this.balance = this.balance + amount;
	}
	
	public Account(int number, String holder, double balance, double withdrawLimit) {
		this.number = number;
		Holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}
	public void withdraw(double amount) throws Main{
		if (amount > this.withdrawLimit) {
			throw new Main("Withdraw limit exceded.");
		}
		else {
			if (amount > this.balance) {
			throw new Main("Balance money exceded.");	
			}
			else {
			this.balance = this.balance - amount;
			}
		}
	}
}
