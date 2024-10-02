import java.util.Random;
import java.util.Scanner;

public class AppArrays {
	public static boolean searcharray(int[] arr, int v) {// allows you to be able to search an array for a value
		boolean check = false;
		int i;
		for (i = 0; i < arr.length; ++i) {
			if (arr[i] == v) {
				check = true;
			}
		}

		return check;
	}

	public static void fillarray(int[] arr) {

		Random rand = new Random();
		int i;
		for (i = 0; i < arr.length; ++i) {
			arr[i] = rand.nextInt(100) + 1;
		}
	}

	public static void printArray(int[] arr) {
		int i;
		for (i = 0; i < arr.length; ++i) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

	}

	public static int sumArray(int[] arr) {
		int sum = 0;
		int i;
		for (i = 0; i < arr.length; ++i) {
			sum = sum + arr[i];
		}
		return sum;
	}

	public static double avrArray(int[] arr) {
		double avr = 0.0;

		return sumArray(arr) / (double) arr.length;
	}

	public static int maxValue(int[] arr) {
		int max = arr[0];
		int i;
		for (i = 1; i < arr.length; ++i) {
			if (arr[i] > max)
				max = arr[i];
		}
		return max;
	}

	public static void sortArray(int[] arr) {
		int i, j;
		for (i = 0; i < arr.length - 1; i++) {
			for (j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				printArray(arr);
			}
		}
	}
	
	public static int[] sortArray2(int[] arr) {
		int i, j;
		for (i = 0; i < arr.length - 1; i++) {
			for (j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}//sorting if statement 
				//printArray(arr);
			}//j loop
		}//i loop
		return arr;
		
	}//end of the method
	// for(i=0;i<arr.leangth-1;i++){
	// for(j=i+1;j<arr.leangth;j++){
	// if (arr[i]>arr[j]){
	// int temp= arr[i];
	// arr[i]=arr[j];
	// arr[j]=temp;

	public static void main(String[] args) {
		int x[] = new int[10];

		fillarray(x);
		printArray(x);
		int sum = sumArray(x);
		System.out.println("sum is " + sum);

		double avr = avrArray(x);
		System.out.println("average is " + avr);

		int max = maxValue(x);
		System.out.println("the max value is" + max);

		Scanner sc = new Scanner(System.in);

		System.out.println("enter a value");
		int value = sc.nextInt();

		boolean ch = searcharray(x, value);
		if (ch == true)
			System.out.println(value + "found");
		else
			System.out.print(value + "notfound");

		String s = "15";
		int b;
		double c;
		b = Integer.parseInt(s) + 5;
		c = Double.parseDouble(s) + 5;
		
		//sortArray(x);
		//printArray(x);
		
		printArray(sortArray2(x));
	}

}