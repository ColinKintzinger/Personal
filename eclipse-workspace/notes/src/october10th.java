import java.util.Scanner;

public class october10th {

	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("enter day number");
		int dayno= sc.nextInt();
		switch (dayno) {
		case 1: System.out.println("the day is Sunday");
		break;
		case 2: System.out.println("the day is Monday");
		break;
		case 3: System.out.println("the day is Tuesday");
		break;
		case 4: System.out.println("the day is Wednesday");
		break;
		case 5: System.out.println("the day is Thursday");
		break;
		case 6: System.out.println("the day is Friday");
		break;
		case 7: System.out.println("the day is Saturday");
		break;
		default: System.out.println("the number is invalid");
		}
		this is how to use switch case instead of having to write out if else statement for each
	
		
	}

}
