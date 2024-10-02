package recursion;

public class factorialRecusionPractice {
public static int factorial(int n) {
	if(n==0)return 1;
	else return(n* factorial(n-1));
}
public static int factorials(int n) {
	int fact=1;
	for(int i=1; i<=n;++i) {
		fact*=i;
	}
	return fact;
}
	public static void main(String[] args) {
		
System.out.println(factorial(5));
System.out.println(factorials(5));
	}

}
