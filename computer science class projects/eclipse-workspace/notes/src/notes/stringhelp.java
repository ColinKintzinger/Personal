package notes;

import java.util.Scanner;

public class stringhelp {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter string");
		String mss=sc.nextLine();
		System.out.print(mss.charAt(0));
		if(Character.isLetter(mss.charAt(0)))System.out.print(mss.charAt(0));
		
	}

}
