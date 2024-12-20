import java.util.Arrays;
import java.util.Random;

public class binarySearch {
	public static void sortArray(int[] number) {
		int temp = 0;
		for (int i = 0; i < number.length-1; i++) {
			for (int j = i + 1; j < number.length; j++) {
				if (number[i] > number[j]) {
					temp = number[i];
					number[i] = number[j];
					number[j] = temp;
				}
			}
		}
	}

	public static int binarySearch(int[] arr, int key) {
		int low;
		int mid;
		int high;

		low = 0;
		high = arr.length - 1;
		while (high >= low) {
			mid = (high + low) / 2;
			if (arr[mid] < key) {
				low = mid + 1;
			} else if (arr[mid] > key) {
				high = mid - 1;
			} else {
				return mid;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		Random rand = new Random();
		int n = 100000;
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextInt(n)+1;
		}
		System.out.println("Array before sorting");
		System.out.println(Arrays.toString(arr));
		sortArray(arr);
		System.out.println("\n array after sorting");
		System.out.println(Arrays.toString(arr));
		if (binarySearch(arr, 203) == -1) {
			System.out.println(203+" not found");
		} else {
			System.out.println("found"+binarySearch(arr, 203));
		}
	}

}
