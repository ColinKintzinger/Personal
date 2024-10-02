package handson;

public class Student {
private String name;
private int ID;
private double gpa;
public Student() {
	super();
	this.name = "";
	ID = 0;
	this.gpa = 0;
}
public Student(String name, int iD, double gpa) {
	super();
	this.name = name;
	ID = iD;
	this.gpa = gpa;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getID() {
	return ID;
}
public void setID(int iD) {
	ID = iD;
}
public double getGpa() {
	return gpa;
}
public void setGpa(double gpa) {
	this.gpa = gpa;
}
@Override
public String toString() {
	return "Student name=" + name + "\n ID=" + ID + "\n gpa=" + gpa;
}


}
