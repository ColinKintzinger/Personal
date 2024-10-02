import java.util.Scanner;

public class ifelse {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("enter x:");
		int x= sc.nextInt();
		if(x>= 0 && x<=100) {
				System.out.print("valid");
		}
		//use braces to use more than one line of code for the if then statement
		else {
			System.out.print("invalid");
		}
	}

}
