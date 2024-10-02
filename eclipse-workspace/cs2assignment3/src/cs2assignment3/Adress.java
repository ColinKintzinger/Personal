package cs2assignment3;

public class Adress {
	private String name;
	private String street;
	private String city;
	private String state;
	private String zip;

	public Adress(String name, String street, String city, String state, String zip) {
		super();
		this.name = name;
		this.street = street;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	@Override
	public String toString() {
		return name + "\n" + street + "\n" + city + "\n" + state + "\n" + zip;
	}

}
