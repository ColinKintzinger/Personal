package cs2assignment2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Part1 {
//	allows user to fill a file with 300 random integers
	public static void createIntFile() throws FileNotFoundException {
		Random rand = new Random();
		PrintStream number = new PrintStream(new File("intNumber.txt"));
		for (int i = 0; i <= 300; ++i) {
			number.println(rand.nextInt(501) + 500);
		}
	}

//adds all prime numbers to an array list from file
	public static void primeList(ArrayList prime) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("intNumber.txt"));
		
		boolean flag = true;
		while (sc.hasNextInt()) {
			int y = sc.nextInt();
			for (int i = 2; i < y; i++) {
				if (y % i == 0) {
					flag = false;
					break;
				}
			}
			if (flag == true) {
				if(prime.contains(y)) {
					break;
				}
				else {
					prime.add(y);
				}
			}
			flag = true;
		}
		System.out.println(prime);
		sc.close();
	}

//	fill array list with all of the odd numbers from the file 
	public static void oddlist(ArrayList odd) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("intNumber.txt"));
		while (sc.hasNextInt()) {
			int y = sc.nextInt();
			if (y % 2 == 1) {
				if(odd.contains(y)) {
					break;
				}
				else {
					odd.add(y);
				}
			}
		}
		System.out.println(odd);
		sc.close();

	}

//	add all even numbers from the file to an array list
	public static void evenlist(ArrayList even) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("intNumber.txt"));
		while (sc.hasNextInt()) {
			int y = sc.nextInt();
			if (y % 2 == 0) {
				if(even.contains(y)) {
					break;
				}
				else {
					even.add(y);
				}
			}
		}
		System.out.println(even);
		sc.close();
	}
	@SuppressWarnings("unchecked")
	public static void printList (ArrayList even, ArrayList odd, ArrayList prime) {
		 Collections.sort(even);
		 System.out.println(even);
		 Collections.sort(odd);
		 System.out.println(odd);
		 Collections.sort(prime);
		 System.out.println(prime);
	}

	public static void main(String[] args) throws FileNotFoundException {
		ArrayList<Integer> even = new ArrayList<>();
		ArrayList<Integer> odd = new ArrayList<>();
		ArrayList<Integer> prime = new ArrayList<Integer>();
		createIntFile();
		primeList(prime);
		oddlist(odd);
		evenlist(even);
		printList(even,odd,prime);
	}

}
