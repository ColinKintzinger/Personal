import java.util.Random;

public class ArrayApp {

	/**
	 * @param arr is the target array of 10 int value
	 */
	static void fillArayt(int[] arr) {
	Random rand=new Random();
		for(int i=0;i<arr.length;++i) {
			arr[i]=rand.nextInt(20)+1;
		}
	}
//	print array
	static void printArray(int[] arr) {
		for(int number : arr) {
		System.out.print(number+ " ");	
		}
		
	}
	public static void main(String[] args) {
//	create an array of 10 integer values
		int arr[]=new int[10];
		
//		calling the fill array
		fillArayt(arr);
		printArray(arr);
		
	}

}
