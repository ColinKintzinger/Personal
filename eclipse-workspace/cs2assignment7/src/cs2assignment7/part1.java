package cs2assignment7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class part1 {
	//takes the information from the file and fills the array named munber
	public static void fillArrayFromFile(int[] number) {
		File file = new File("UniqueIntegers.txt");
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
//takes the array that was filled and sorts the members from least to greatest
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
//uses the linear search method
	public static int linearSearch(int[] number, int key) {
		int i;
		for (i = 0; i < number.length; ++i) {
			if (number[i] == key) {
				return i;
			}
		}
		return -1;/* not fount */
	}
//uses the binary search to find the number
	public static int binarySearch(int[] number, int key) {
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
				return mid;
			}
		}
		return -1;
	}

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(System.in);
		int[] number = new int[1000];
		fillArrayFromFile(number);
		sortArray(number);
		System.out.println("Enter a value that you would like to search for:");
		int key=0;
		try {
		 key = sc.nextInt();
		}
		catch(Exception e) {
			
		}
		if (linearSearch(number, key) == -1) {
			System.out.println("not found");
		} 
		else {
			System.out.println("found" + linearSearch(number, key));
		}

		if (binarySearch(number, key) == -1) {
			System.out.println("not found");
		} else {
			System.out.println("found" + binarySearch(number, key));
		}

	}
	

}
