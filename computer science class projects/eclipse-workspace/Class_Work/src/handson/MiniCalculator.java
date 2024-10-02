package handson;

import java.util.Scanner;

public class MiniCalculator {
	public static double adition(double x, double y, double z) {
		z = x + y;
		return z;
	}

	public static double subtraction(double x, double y, double z) {
		z = x - y;
		return z;
	}

	public static double multiplication(double x, double y, double z) {
		z = x * y;
		return z;
	}

	public static double division(double x, double y, double z) {
		z = x + y;
		return z;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		tells user to select an operation they would like to do 
		System.out.println(
				"what operation woul you like to do? \n 1.addition \n 2.subtraction \n 3.multiplication \n 4.division ");

		int operation = sc.nextInt();
//		tells user to input 2 numerical values and also initializes the variables that will be used in the methods above 
		System.out.println("please enter 2 values: ");
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		double z = 0;
//		determins which of the method will be used to solve the problem
//		if (operation == 1) {
//			System.out.println(adition(x, y, z));
//		} else if (operation == 2) {
//			System.out.println(subtraction(x, y, z));
//		} else if (operation == 3) {
//			System.out.println(multipication(x, y, z));
//
//		} else {
//			System.out.println(division(x, y, z));
//		}
		switch (operation) {
		case 1:
			System.out.println(adition(x, y, z));
			break;
		case 2:
			System.out.println(subtraction(x, y, z));
			break;
		case 3:
			System.out.println(multiplication(x, y, z));
			break;
		case 4:
			System.out.println(division(x, y, z));
			break;
		}

	}

}
