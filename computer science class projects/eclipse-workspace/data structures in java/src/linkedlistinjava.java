import java.util.LinkedList;

public class linkedlistinjava {

	public static void main(String[] args) {
		LinkedList<String> list= new LinkedList();
		
		list.add("CS-144");
		list.add("CS-145");
		list.addLast("CS-244");
		list.addFirst("CS-254");
		list.add(2, "CS-324");
		
		System.out.println(list);
		
		list.remove("CS-145");
		list.remove(3);
		list.removeFirst();
		list.removeLast();
		
		System.out.println(list);

	}

}
