package workingwitharraylist;

import java.util.ArrayList;

public class App {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>();

		ArrayList<Integer> listint = new ArrayList<>();

		listint.add(7);
		listint.add(8);

		System.out.println(listint);

		list.add("car");
		list.add("book");
		
		

		System.out.println(list);
		for (int i = 1; i < 921; ++i) {
			list.add("home");
		}

		list.add(list.size(), "i am computer programer");
		System.out.println(list);

		System.out.println("im done!");

	}

}
