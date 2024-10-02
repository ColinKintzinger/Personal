import java.util.ArrayList;
import java.util.Iterator;
public class arrayAndArrayList {

	public static void main(String[] args) {
		int[] numbers= {2,4,5,6,7};
		
		for(int i=0;i<numbers.length;++i) {
			System.out.println(numbers[i]+ " ");
		}
		System.out.println("\n"+"-".repeat(40));
		ArrayList<Integer> listInt= new ArrayList<>();
		listInt.add(2);
		listInt.add(4);
		listInt.add(5);
		listInt.add(6);
		listInt.add(7);
		System.out.println(listInt);
		listInt.add(0,1);
		listInt.add(2,3);
		listInt.add(8);
		System.out.println(listInt);
		
		Iterator<Integer> itr1= listInt.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next()+ " ");
		}
		System.out.println("\n"+"-".repeat(40));
		
		
	}

}
