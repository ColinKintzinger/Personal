import java.util.ArrayList;
import java.util.Scanner;

public class App {

	public static Course gradesroster(ArrayList<Student> list, String coursename) {
		
		double[] grades=new double[4];
		ArrayList<String> studentnames=new ArrayList<>();
		
		for(int i=0;i<list.size();++i) {
			if(coursename.equals(list.get(i).getCourseName())) {
				grades[i]=list.get(i).getMidtermI()+list.get(i).getMidtermII()+list.get(i).getFinalExam();
				studentnames.add(list.get(i).getStudentName());
			}
		}
		
		
		Course course = new Course();
		return course;

	}

	public static void main(String[] args) {
		ArrayList<Student> students = new ArrayList<>();
		Student st = new Student();
		Scanner sc = new Scanner(System.in);

		System.out.println("enter course name ");
		String cName = sc.nextLine();
		st.setCourseName(cName);

		System.out.println("enter student name");
		String sname = sc.nextLine();
		st.setStudentName(sname);

		System.out.println("enter midterm I grade ");
		st.setMidtermI(sc.nextDouble());

		System.out.println("enter midterm II grade ");
		st.setMidtermII(sc.nextDouble());

		System.out.println("enter final grade ");
		st.setFinalExam(sc.nextDouble());

		students.add(st);
		System.out.println(students);

		Course courseresult=gradesroster(students, "cs 144");
		System.out.println();
	}

}
