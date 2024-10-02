import java.util.Queue;
import java.util.LinkedList;
import java.util.PriorityQueue;
public class queuDataStructures {

	public static void main(String[] args) {
		PriorityQueue<Integer> myQueue= new PriorityQueue<Integer>();
		//Queue<Integer> myQueue= new LinkedList<Integer>();
		myQueue.add(2);
		myQueue.add(15);
		myQueue.add(7);
		myQueue.add(9);
		myQueue.add(13);
		myQueue.add(1);
		System.out.println(myQueue);
		
		if(myQueue.contains(19))System.out.println("true");
		else System.out.println("false");
		
		System.out.println(myQueue.peek());
		
	}

}
