import java.util.Scanner;

public class prime {
	public static void primenumber(int x) {
		for (int k=2;k<=x;++k) {
			int y;
			boolean check=true;
			
			for(y=2;y<=k-2;y++) {
				if(k%y==0) {
					check=false;
					break;
				}
			if(check==true) {
				System.out.println(k+" is prime");
			}
			}
		}
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a value to check for prime numbers:");
		int x = sc.nextInt();
		primenumber(x);
	}

}
