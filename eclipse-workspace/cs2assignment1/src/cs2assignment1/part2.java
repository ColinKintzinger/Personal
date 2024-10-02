package cs2assignment1;

import java.util.Scanner;

public class part2 {

	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println(" how many sequences of the sequence would you like");
	int count = sc.nextInt();
	int n1=0,n2=1,n3;
	System.out.print(n1+ " "+ n2);
	
	for(int i =2;i<count;i++) {
		n3=n1+n2;
		System.out.print(" "+ n3);
		n1=n2;
		n2=n3;
	}
	
	}

}
