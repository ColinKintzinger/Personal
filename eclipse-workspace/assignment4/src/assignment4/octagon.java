package assignment4;

import java.util.Scanner;

public class octagon {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		//asking the user to insert a side length
		System.out.println("enter a side length:");
		//allows user to enter a value
		double sl= sc.nextDouble();
		//written out equation to find the area 
		double area= (6*Math.pow(sl, 2)/(4*Math.tan(Math.PI/6)));
		//prints out the answer that is give from the equation above
		System.out.println("the area of an octagon is "  +area);
	}

}
