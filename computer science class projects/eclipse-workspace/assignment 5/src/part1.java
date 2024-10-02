import java.util.Scanner;

public class part1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Part 1
		System.out.println("enter a value:");

		int c;
		int r;
		int a = sc.nextInt();
		for (r = 1; r <= a; r++) {
			for (c = 1; c <= a; c++) {
				if (r == 1 || r == a)
					System.out.print("*");

				if (r >= 2 && r < a) {
					if (c == 1 || c == a)
						System.out.print("*");
					else
						System.out.print(" ");
				}
			} // end of col loop

			System.out.println();
		} // End of rows loop
		System.out.println();
		// part 2
		for (r = 1; r <= a; r++) {
			for (c = 1; c <= a; c++) {
				if(r==c)	System.out.print("*"); else 	System.out.print(" ");

			} // end of col loop

			System.out.println();
		} // End of rows loop
		System.out.println();
		// part 3
				for (r = 1; r <= a; r++) {
					for (c = 1; c <= a; c++) {
						if(r+c==a+1)	System.out.print("*"); else 	System.out.print(" ");

					} // end of col loop

					System.out.println();
				} // End of rows loop
	}// end of main
}// end of class
