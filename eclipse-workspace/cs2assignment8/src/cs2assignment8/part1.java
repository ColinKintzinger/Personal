package cs2assignment8;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class part1 {
	// takes the information from the file and fills the array named number
	public static void fillArrayFromFile(int[] number) {
		File file = new File("Numbers.txt");
		try {
			Scanner sc = new Scanner(file);
			int i = 0;
			while (sc.hasNextInt()) {
				number[i++] = sc.nextInt();
			}

			sc.close();
			// System.out.println(Arrays.toString(number));
		} catch (Exception FileNotFoundException) {
			System.out.println("file not found");
		}
	}
	//sorts array from smallest to largest number
	public static void sortArray(int[] number) {
		try {
			int temp = 0;
			for (int i = 0; i < number.length; i++) {
				for (int j = i + 1; j < number.length; j++) {
					if (number[i] > number[j]) {
						temp = number[i];
						number[i] = number[j];
						number[j] = temp;
					}
				}
			}
			System.out.println(Arrays.toString(number));
		} catch (Exception e) {
			System.out.println("out of bounds");
		}
	}
//uses linear search algorithm to see if variable key is found in the array
	public static boolean linearSearch(int[] number, int key) {
		int i;
		for (i = 0; i < number.length; ++i) {
			if (number[i] == key) {
				return true;
			}
		}
		return false;/* not fount */
	}
	//uses binary search algorithm to see if variable key is found in the array
	public static boolean binarySearch(int[] number, int key) {
		int low;
		int mid;
		int high;

		low = 0;
		high = number.length - 1;
		while (high >= low) {
			mid = (high + low) / 2;
			if (number[mid] < key) {
				low = mid + 1;
			} else if (number[mid] > key) {
				high = mid - 1;
			} else {
				return true;
			}
		}
		return false;
	}
	//uses binary search algorithm while implementing recursion to see if variable key is found in the array
	public static boolean binarySearchRecursion(int[] number, int key, int low, int high) {
		
		if (high < low) {
			return false;
		}else {
		int mid = (high + low) / 2;
		if (number[mid] == key) {
			return true;
		} else if (number[mid] < key) {
			// low = mid + 1;
			return binarySearchRecursion(number, key, mid + 1, high);
		} else if (number[mid]>key)  {
			// high = mid - 1;
			return binarySearchRecursion(number, key,low, mid - 1);
		}
		}
		
		
		return false;
		
	}

	public static void main(String[] args) {
		//int[] number = {2,5,8,7,12};// new int[1000];
		int[] number =  new int[1000];
		int low = 0;
		int high = number.length-1;
Scanner sc=new Scanner(System.in);
		fillArrayFromFile(number);
		System.out.println(Arrays.toString(number));
		sortArray(number);
		System.out.println("-".repeat(50));
		System.out.println(Arrays.toString(number));
		int key=0;
		try {
		key=sc.nextInt();
		}
		catch(Exception e) {
			System.out.println("this is not a number");
		}
		if (binarySearchRecursion(number,key, low, high)==true) {
			System.out.println("found the value");
		}else {
			System.out.println("not found the value");
		}
	}

}
