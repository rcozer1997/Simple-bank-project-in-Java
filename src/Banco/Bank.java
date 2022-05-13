package Banco;
import java.util.ArrayList;

public class Bank {
	ArrayList<Account>accounts;
	String bankName;
	int bankCode;

	Bank(String n, int c) {
		bankName = n;
		bankCode = c;
		accounts = new ArrayList<>();
	}
	void registerAccount() {
		Account c = Account.read();
		accounts.add(c);				
	}
	
	int searchAccountID() {
		
	}
	void visualizeAccount() {
		
	}
	void removeAcc(){
		
	}
	void listAccs() {
		
	}
	void updateMainRegister() {
		
	}
	void listNegativeAccounts() {
		
	}
}