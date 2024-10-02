package handson;

public class Employee {
	private int employeeeID;
	private String fullName;
	private double salary;

	public Employee() {
		super();
		this.employeeeID = 0;
		this.fullName = "-";
		this.salary = 0.0;
	}

	public Employee(int employeeeID, String fullName, double salary) {
		super();
		this.employeeeID = employeeeID;
		this.fullName = fullName;
		this.salary = salary;
	}

	public int getEmployeeeID() {
		return employeeeID;
	}

	public void setEmployeeeID(int employeeeID) {
		this.employeeeID = employeeeID;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee \n------------------------\nemployeeeID=" + employeeeID + "\n------------------------\n fullName=" + fullName + "\n------------------------\n salary=" + salary + "\n------------------------\n";
	}

}
