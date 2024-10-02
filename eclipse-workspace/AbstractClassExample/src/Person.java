
public abstract class Person {
private String fname;
private String lname;
private int ID;

public Person() {
	super();
	// TODO Auto-generated constructor stub
}

public Person(String fname, String lname, int iD) {
	super();
	this.fname = fname;
	this.lname = lname;
	ID = iD;
}

public String getFname() {
	return fname;
}
public void setFname(String fname) {
	this.fname = fname;
}
public String getLname() {
	return lname;
}
public void setLname(String lname) {
	this.lname = lname;
}
public int getID() {
	return ID;
}
public void setID(int iD) {
	ID = iD;
}

	abstract String fullName();


}
