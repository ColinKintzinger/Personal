package assignment4;



public class runApp {

	public static void main(String[] args) {
		
		
		Rectangle a = new Rectangle();
		
		Rectangle b = new Rectangle(3,2);
		
		b.setLength(5);
		b.setWidth(7);
		
		
		
		System.out.println(b.getLength());
		System.out.println(b.getWidth());
		
		b.recArea();
		
		System.out.println(b.recArea());
	}

}
