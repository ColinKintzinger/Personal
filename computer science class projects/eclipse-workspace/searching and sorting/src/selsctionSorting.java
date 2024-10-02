
public class selsctionSorting {
public static void selectionSort(int[] numbers) {
	int i;
	int j;
	int indexSmallest;
	int temp;
	for(i=0;i< numbers.length;++i) {
		indexSmallest=i;
		for(j=i+1;j<numbers.length;++j) {
			if(numbers[i]<numbers[indexSmallest]) {
				indexSmallest=j;
				
			}
		}
		temp=numbers[i];
		numbers[i]=numbers[indexSmallest];
		numbers[indexSmallest]=temp;
	}
}
	public static void main(String[] args) {
		int[] numbers= {5,3,1,9,2,11};
		selectionSort(numbers);
		for(int i=0;i<numbers.length;++i) {
			System.out.print(numbers[i]+ " ");
		}
	}

}
