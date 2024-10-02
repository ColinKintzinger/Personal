import java.util.Scanner;

public class scanner2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("what is your major");
		String major= input.nextLine();
		System.out.print("how many courses are you taking this semester");
		int courses= input.nextInt();
		System.out.print("your major is:"+major+"\n");
		System.out.print("you are taking:"+courses+"courses");
	}

}
