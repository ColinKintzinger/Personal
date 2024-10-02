package cs2assignment6;

import java.util.ArrayList;

@FunctionalInterface 
interface GenneralFunction<T, E, R> { 
R perform(T t , E e); 
} 
public class Part1 {

	public static void main(String[] args) {
		ArrayList<String> list1=new ArrayList<>();
		ArrayList<String> list2=new ArrayList<>();
		ArrayList<String> list3=new ArrayList<>();
		
		list1.add("Ben");
		list1.add("Mark");
		list1.add("Emily");
		System.out.println(list1);
		
		list2.add("Micheal");
		list2.add("Jason");
		list2.add("Jane");
		list2.add("hana");
		System.out.println(list2);
//		list1.forEach(n-> list3.add(n));
//		list2.forEach(n->list3.add(n));
//		System.out.println(list3);
		
		GenneralFunction<ArrayList<String>,ArrayList<String>, ArrayList<String>> ref= (t,e)->{
			list1.forEach(n-> list3.add(n));
			list2.forEach(n->list3.add(n));
			
			return list3;
			
		};
		
		System.out.println(ref.perform(list2, list3));
		double db1= 4;
		double db2= 3;
		
		GenneralFunction<Double,Double,Boolean> ref2=(t,e)->{
			boolean check1=true;
			boolean check2=true;
			boolean check3=true;
			for (int i = 2; i < db1; i++) {
				if (db1 % i == 0) {
					check1 = false;
					break;
				}
			}
			for (int i = 2; i < db2; i++) {
				if (db2 % i == 0) {
					check2 = false;
					break;
				}
			}
			if(check1==true && check2==true) {
				return check3;
			}
			else {
				check3=false;
				return check3;
			}
			
			
		};
	       
		System.out.println(ref2.perform(db1, db2));
	}

}
