package cs2assignment1;

import java.util.Scanner;

public class Part1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("pleas enter a value for A, B, C");
//		this will allow the user to input values for the three variables.
		double A = sc.nextInt();
		double B = sc.nextInt();
		double C = sc.nextInt();
		double root1, root2;
//		solve the determinant to determine what part of the if else statement will be used
		double determinant = B * B - 4 * A * C;
//      just solving the problem normally when the determinant is positive
		if (determinant > 0) {
			root1 = (-B + Math.sqrt(determinant)) / (2 * A);
			root2 = (-B - Math.sqrt(determinant)) / (2 * A);
			System.out.println(root1 + "and" + root2);
		}
//		what will happen if the determinant is equal to zero
		else if (determinant == 0) {
			root1 = root2 = -B / (2 * A);
			System.out.println(root1);
		} 
//		what happens if he value is negative
		else {
			double real = -B / (2 * A);
			double imagionary = Math.sqrt(determinant) / (2 * A);
			System.out.println("real" + real + "  imagionary" + imagionary);
		}

	}

}
