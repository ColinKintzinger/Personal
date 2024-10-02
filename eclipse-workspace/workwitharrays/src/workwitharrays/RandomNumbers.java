package workwitharrays;

import java.util.Random;

public class RandomNumbers {

	public static void main(String[] args) {
		Random rand = new Random();
		int x[] = new int[10];
		x[0] = 1;
		x[1] = 15;
		x[2] = x[1] + x[0];
		int i;

		for (i = 0; i < 10; ++i) {
			
			x[i]=rand.nexInt(1000);
			System.out.println(x[1]);
		}
//rand.nextInt(6) * 5
	}// end main

}// end class
