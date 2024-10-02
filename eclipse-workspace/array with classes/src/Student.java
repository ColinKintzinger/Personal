
public class Student {
	private String studentName;
	private String courseName;
	private double midtermI;
	private double midtermII;
	private double finalExam;

	public Student() {
		super();
		this.studentName = "";
		this.courseName = "";
		this.midtermI = 0;
		this.midtermII = 0;
		this.finalExam = 0;
	}

	public Student(String studentName, String courseName, double midtermI, double midtermII, double finalExam) {
		super();
		this.studentName = studentName;
		this.courseName = courseName;
		this.midtermI = midtermI;
		this.midtermII = midtermII;
		this.finalExam = finalExam;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public double getMidtermI() {
		return midtermI;
	}

	public void setMidtermI(double midtermI) {
		this.midtermI = midtermI;
	}

	public double getMidtermII() {
		return midtermII;
	}

	public void setMidtermII(double midtermII) {
		this.midtermII = midtermII;
	}

	public double getFinalExam() {
		return finalExam;
	}

	public void setFinalExam(double finalExam) {
		this.finalExam = finalExam;
	}

	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", courseName=" + courseName + ", midtermI=" + midtermI
				+ ", midtermII=" + midtermII + ", finalExam=" + finalExam + "]";
	}

}
