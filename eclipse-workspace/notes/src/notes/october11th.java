package notes;

import java.util.Scanner;

public class october11th {
	static int doubleValue(int x){
		int r=x*2;
		return r;
	}
	//needs to be able to return the same data type
	static double avr3Values(double x,double y, double z) {
		return(x+y+z/3);
	}
	static void printLine() {
		System.out.println("--------------------------");
	}
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter int value");
	int x = sc.nextInt();
	int res = doubleValue(x);
	System.out.println("resault="+res);
	printLine();
	System.out.println(avr3Values(3.0,2.0,1.0));
	printLine();
	
	}

}
