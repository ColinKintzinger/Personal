import java.util.Random;

public class linearSearch {
	public static int linearSearch(int[] numbers, int key) {
		int i;
		for (i = 0; i < numbers.length; ++i) {
			if (numbers[i] == key) {
				return i;
			}
		}
		return -1;/* not fount */
	}

	public static void main(String[] args) {
		long bT=System.currentTimeMillis();
		Random rand = new Random();
		int n = 1000000;
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextInt(n)+1;
		}
		//calling the linear search method
		
		if (linearSearch(arr, 5) == -1) {
			System.out.println("not found");
		} else {
			System.out.println("found"+linearSearch(arr, 5));
		}
		long eT=System.currentTimeMillis();
		System.out.println("Excution time:"+ (eT-bT)+" mili second");
	}
}
