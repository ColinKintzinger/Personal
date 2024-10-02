package october12thproject;

import java.util.Scanner;

public class driver {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		
		double a,b;
		
		System.out.println("enter first value");
		a= sc.nextDouble();
		
		System.out.print("enter second value:");
		b= sc.nextDouble();
		
		double res = Myclass.sumxy(a,b); //call the function that gives the sum of xy
		
		double ressub = Myclass.subxy(a,b);
		
		double resmult = Myclass.multxy(a,b);
		
		double resdiv = Myclass.divxy(a,b);
		
//Myclass m= new Myclass();//create an object from class to use in dynamic
		
		Myclass.printLine();
		System.out.println(a + "+" + b + "=" + res ); 
		Myclass.printLine();
		System.out.println(a + "-" + b + "=" + ressub );
		Myclass.printLine();
		System.out.println(a + "*" + b + "=" + resmult );
		Myclass.printLine();
		if( b==0) {
		System.out.println("can't devide by 0");
	}
		else
		System.out.println(a + "/" + b + "=" + resdiv );
		Myclass.printLine();
	}

}
