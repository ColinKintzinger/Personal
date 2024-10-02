
public class student {
	private String stName;
	private int stID;
	private double stGPA;
	public student() {
		super();
		this.stName = "-";
		this.stID = 0;
		this.stGPA = 0.0;
	}
	public student(String stName, int stID, double stGPA) {
		super();
		this.stName = stName;
		this.stID = stID;
		this.stGPA = stGPA;
	}
	public String getStName() {
		return stName;
	}
	public void setStName(String stName) {
		this.stName = stName;
	}
	public int getStID() {
		return stID;
	}
	public void setStID(int stID) {
		this.stID = stID;
	}
	public double getStGPA() {
		return stGPA;
	}
	public void setStGPA(double stGPA) {
		this.stGPA = stGPA;
	}
	
	
}
