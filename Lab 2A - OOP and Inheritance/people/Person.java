package people;

public class Person {
	String name;
	String phoneNumber;
	String address;
	String email;
	
	public Person(String name, String phoneNumber, String address, String email) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.email = email;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", phoneNumber=" + phoneNumber + ", address=" + address + ", email=" + email
				+ "]";
	}
}
