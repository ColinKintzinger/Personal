package assignment3;

import java.util.Scanner;

public class salestax {

	public static void main(String[] args) {
		Scanner taxes= new Scanner(System.in);
		double retail;
		double tax;
		System.out.println("how much is the product that you wish to purchase?");
		retail= taxes.nextDouble();
		System.out.println("what is the tax on the item?");
		tax= taxes.nextDouble();
		double taxtotal= (tax/100)*retail;
		double total = taxtotal+retail;
		System.out.print("your total today is:"+total+"dollars");
	}

}
