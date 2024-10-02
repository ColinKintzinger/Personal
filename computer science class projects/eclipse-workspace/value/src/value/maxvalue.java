package value;

import java.util.Scanner;

public class maxvalue {

	public static void main(String[] args) {
		try (Scanner CS = new Scanner(System.in)) {
			System.out.println("enter two values:");
			int x= CS.nextInt();
			int y= CS.nextInt();
			if (x>y) 
				System.out.print("the largest value is" +x);
			
			else
				System.out.print("largest value is:" +x);
		}
	}
	

}
