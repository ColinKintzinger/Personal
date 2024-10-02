package assignment4;

import java.util.Scanner;

public class stringpart {

	public static void main(String[] args) {
		Scanner words= new Scanner(System.in);
		System.out.println("enter your phrase");
		String phrase= words.nextLine();
		//finding string length
		int n= phrase.length();
		//first char
		char first= phrase.charAt(0);
		//last char
		char last= phrase.charAt(n-1);
		//only printing half
		String half= phrase.substring(0,n/2);
		
		
		System.out.println(phrase.toLowerCase());
		System.out.println(phrase.toUpperCase());
		System.out.println(first+"" +last);
		System.out.println(half);
		
		// Character.isLetter();
		//how to detect the first character in a string for character
		if(Character.isLetter(phrase.charAt(0))) System.out.println("the string starts with the letter:" +phrase.charAt(0));
		//check for digit
		if(Character.isDigit(phrase.charAt(0))) System.out.println("the string starts with the digit:" +phrase.charAt(0));
		//check for symbol
		if(!Character.isLetter(phrase.charAt(0)) && !Character.isDigit(phrase.charAt(0))) System.out.println("the string starts with the Symbol:" +phrase.charAt(0));
	}

	

}
