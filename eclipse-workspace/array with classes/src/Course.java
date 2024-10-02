import java.util.ArrayList;

public class Course {
	private String courseName;
	private double[] grades;
	private ArrayList<String> studentName;
	public Course() {
		super();
		courseName = "";
		grades = new double[4];
		studentName = new ArrayList<String>();
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public double[] getGrades() {
		return grades;
	}
	public void setGrades(double[] grades) {
		this.grades = grades;
	}
	public ArrayList<String> getStudentName() {
		return studentName;
	}
	public void setStudentName(ArrayList<String> studentName) {
		this.studentName = studentName;
	}
	
	
}
