
public class Person {
	private String name;
	private String email;
	public Person() {
		super();
		// TODO Auto-generated constructor stub
		this.email="@";
		this.name="-";
	}
	public Person(String name, String email) {
		super();
		this.name = name;
		this.email = email;
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
	@Override
	public String toString() {
		return "Person [name=" + name + ", email=" + email + "]";
	}
	
	
}