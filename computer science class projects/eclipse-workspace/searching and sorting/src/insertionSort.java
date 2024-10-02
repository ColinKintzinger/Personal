import java.util.Arrays;
import java.util.Random;

public class insertionSort {
public static void insertionSorting(int[] list) {
	for(int i=1;i<list.length;++i) {
		int j=i;
		while(j>0 && list[j]<list[j-1]) {
			int tmp=list[j];
			list[j]=list[j-1];
			list[j-1]=tmp;
			j--;
		}
	}
}
	public static void main(String[] args) {
		Random rand = new Random();
		int n = 10;
		int[] list = new int[n];
		for (int i = 0; i < list.length; i++) {
			list[i] = rand.nextInt(n)+1;
		}
	System.out.println(Arrays.toString(list));
	insertionSorting(list);
	System.out.println(Arrays.toString(list));
	}

}
