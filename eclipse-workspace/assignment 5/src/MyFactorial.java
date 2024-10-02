import java.util.Scanner;

public class MyFactorial {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter a value");
		
		int a = sc.nextInt();
		
		int fac=1;
		
		for(int i=1; i<=a ; i++) {
			fac*=i;
		}
		System.out.print("the factorial of "+ a +"is"+ fac);
	}

}
