import java.util.Scanner;

public class PointApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Point p1= new Point(15,10);
		Point p2= new Point(15,100);
		System.out.println(p1);
		System.out.println(p2);
//		if(p1.equals(p2)) {
//		System.out.println("equal");
//	}
//	else {
//		System.out.println("not equal");
//	}
		
		if(p1.equals(sc)) {
			System.out.println("equal");
		}
		else {
			System.out.println("not equal");
		}
System.out.println(p1.hashCode());
System.out.println(p2.hashCode());
	}//end main

}//end class
