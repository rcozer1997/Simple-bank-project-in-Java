package Banco;
import java.util.Scanner;

public class Account {
	static final double STD_BALANCE = 100.00;
	static final double STD_LIMIT = 0.00;
	String number;
	double balance;
	double limit;
	Person client;

	Account(String n, Person c) {
		number = n;
		balance = STD_BALANCE;
		limit = STD_LIMIT;
		client = c;
	}
	static Account read() {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Number: ");
		String number = s.nextLine();
		s.nextLine();
		Person client = Person.read();
		
		
		Account account = new Account(number, client);
		
		return account;
	}
	
	public String toString() {
		return "Account("+ number + ", Balance = " + balance + ", Limit = " + limit + ", Client = " + client + ")";
	}

	public double disponible() {
		double sum = balance + limit;
		return sum;
	}

	public boolean withdraw(double spent) {
		if(balance > 0) {
			balance = balance - spent;
			return true;
		}
		else
			System.out.print("Balance insufficient! ");
			return false;
	}
	public double deposit(double value) {
		balance = balance + value;
		return balance;
	}
}
