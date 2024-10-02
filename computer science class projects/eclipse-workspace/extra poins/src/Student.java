
public class Student {
private int ID;
private String name;
private String email;
private String major;

public Student() {
	super();
	ID = 0;
	this.name = "-";
	this.email = "-";
	this.major = "-";
}

public Student(int iD, String name, String email, String major) {
	super();
	ID = iD;
	this.name = name;
	this.email = email;
	this.major = major;
}

public int getID() {
	return ID;
}

public void setID(int iD) {
	ID = iD;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getMajor() {
	return major;
}

public void setMajor(String major) {
	this.major = major;
}

@Override
public String toString() {
	return "Student [ID=" + ID + ", name=" + name + ", email=" + email + ", major=" + major + "]";
}

}
