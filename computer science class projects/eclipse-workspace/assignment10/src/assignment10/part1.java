package assignment10;

import java.util.ArrayList;
import java.util.Random;

public class part1 {
public static ArrayList<Integer> intersect(ArrayList<Integer> list3, ArrayList<Integer> list2, ArrayList<Integer> list){
	Random rand= new Random();
	for(int i=0; i<10;i++) {
		list.add(rand.nextInt(20)+1);
		list2.add(rand.nextInt(20)+1);
	}
	for(int i=0; i<10;++i) {
		if(list.contains(list2.get(i))) {
			list3.add(i);
		}
	}
	return list3;
}
	public static void main(String[] args) {
		ArrayList<Integer> list= new ArrayList<>();
		ArrayList<Integer> list2= new ArrayList<>();
		ArrayList<Integer> list3= new ArrayList<>();
		intersect(list3, list2, list);
		System.out.println(list);
		System.out.println(list2);
		System.out.println(list3);
		
	}

}
