import java.util.Scanner;

public class MathEquasion {
	public static double numerator(int xvalue,int i) {
		return Math.pow(xvalue+(i*i), i);
	}
	public static int denominator(int x) {
		int c=1;
		for(int i=x;i>=1;i--) {
			c=c*1;
		}
		return c;
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter values");
		int x = sc.nextInt();
		int i;
		Double y=0.0;
		String qu=" ";
		for(i=x;i<=5;i++) {
			qu=qu+numerator(x,i)+"/"+denominator(6-i)+" + ";
			y=y+(numerator(x,i)/denominator(6-i));
		}
		System.out.println(qu);
		System.out.println(y);
	}

}
