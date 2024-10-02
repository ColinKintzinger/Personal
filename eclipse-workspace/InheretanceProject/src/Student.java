
public class Student extends Person {
	private String major;
	private double gpa;

	public Student() {
		super();
		this.major = "-";
		this.gpa = 0.0;
	}

	public Student(String name, String email) {
		super(name, email);
	}

	public Student(String name, String email, String major, double gpa) {
		super(name, email);
		this.major = major;
		this.gpa = gpa;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	@Override
	public String toString() {
		return "[Student name ="+ super.getName() + "email="+super.getEmail()+ "major=" + major + ", gpa=" + gpa + "]";
	}

}
