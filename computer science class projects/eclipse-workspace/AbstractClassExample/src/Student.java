
public class Student extends Person {
	private String major;
	private double gpa;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String fname, String lname, int iD, String major, double gpa) {
		super(fname, lname, iD);
		this.major = major;
		this.gpa = gpa;
	}
	@Override
	String fullName() {
		return super.getFname()+" "+super.getLname();
	}
	@Override
	public String toString() {
		return "Student [major=" + major + ", gpa=" + gpa + ", fullName()=" + fullName() + ", ID="+ this.getID()+"]";
	}
	

}
