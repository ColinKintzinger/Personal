package handson;

public class StudentRun {

	public static void main(String[] args) {
		Student st = new Student();
		System.out.println(st.getName() + " " + st.getID() + " " + st.getGpa());
		
		
		Student st1 = new Student("ben", 100, 3.0);
		System.out.println(st1.getName() + " " + st1.getID() + " " + st1.getGpa());
		
		System.out.println(st);

	}

}
