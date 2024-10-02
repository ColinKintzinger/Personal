package inclassHandsOn;

import java.util.Scanner;

public class Palindromes {
public static boolean isPalindrome(String word, int i, int j) {
	if(i>=j) {
		return true;
	}
	
	if(word.charAt(i)==word.charAt(j)) {
		return isPalindrome(word, i+1, j-1);
	}
	else {
		return false;
	}
	
}
public static int powerRecursion(int base, int exponent) {
	if(exponent>=1) {
		return base*powerRecursion(base, exponent-1);
	}
	else return 1;
}
	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("enter word:");
String word=sc.nextLine();
System.out.println(isPalindrome(word, 0, word.length()-1));
int pow=powerRecursion(10, 2);
System.out.println(pow);
	}

}
