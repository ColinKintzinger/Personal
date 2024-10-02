package assignment3;

import java.util.Scanner;

public class eurostousd {

	public static void main(String[] args) {
		Scanner conversion= new Scanner(System.in);
		double USD;
		System.out.println("how much USD would you like to convert?");
		USD= conversion.nextDouble();
		double euros= USD*.99;
		System.out.print("You now have:"+euros+"Euros");
		

	}

}
