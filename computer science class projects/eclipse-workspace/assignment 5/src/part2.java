import java.util.Scanner;

public class part2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter a value:");

		double x = sc.nextInt();

		double solution = 1;
		for (double b = 1; b <= x; b++) {
			solution += (1 / b);
		}

		System.out.print(solution);
	}

}
