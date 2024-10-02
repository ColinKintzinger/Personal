package cs2assignment2;

import java.util.Scanner;

public class BakApp {
	//allows the user to deposit money into account and updates bank balance
	public static void deposit(BankAccount bank) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter amout to deposit");
		int ammount = sc.nextInt();
		bank.setBalance(bank.getBalance() + ammount);
		System.out.println(bank.getBalance());
	}
// allows user to withdraw money from the account and updates balance 
	public static void withdrawl(BankAccount bank) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter amout to withdrwl");
		int ammount = sc.nextInt();
		if (bank.getBalance() < ammount) {
			System.out.println("not enough money");
			withdrawl(bank);
		} else {
			bank.setBalance(bank.getBalance() - ammount);
			System.out.println(bank.getBalance());
		}
	}
//tells user what tax bracket they are in based on their bank amount
	public static void taxRate(BankAccount bank) {
		if (bank.getBalance() < 15000) {
			System.out.println("your tax rate is 3% your new balance owed:");
			double tax1 = bank.getBalance() * .03;
			System.out.println(tax1);
		}
		if (bank.getBalance() > 15000 && bank.getBalance() < 30000) {
			System.out.println("your tax rate is 5% your new balance is:");
			double tax1 = bank.getBalance() * .05;
			System.out.println(tax1);
		} else if (bank.getBalance() > 30000) {
			System.out.println("your tax rate is 8% your new balance is:");
			double tax1 = bank.getBalance() * .08;
			System.out.println(tax1);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BankAccount bank = new BankAccount("colin kintzinger", "colink@gmail.com", "123abc", 31000);
		System.out.println(
				"what would you like to do: \nPress 1 to deposit money into account \nPress 2 to withdrawl from account \nPress 3 to check tax rate based on your account");
		int operation = sc.nextInt();
		switch (operation) {
		case 1:
			deposit(bank);
			break;
		case 2:
			withdrawl(bank);
		case 3:
			taxRate(bank);
		}

		// deposit(bank);
		// withdrawl(bank);
		// taxRate(bank);
		System.out.println(bank);
	}

}
