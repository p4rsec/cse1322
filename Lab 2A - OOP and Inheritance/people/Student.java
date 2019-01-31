package people;

public class Student extends Person {
	String classRank;
	
	
	public Student(String name, String phoneNumber, String address, String email, String classRank) {
		super(name, phoneNumber, address, email);

		this.classRank = getClassRank();
		
	}
	

	private String getClassRank() {
		String classRank;
		
		// TODO finish get() method
		
		return classRank;
	}


	@Override
	public String toString() {
		return "Student [name=" + name + ", phoneNumber=" + phoneNumber + ", address=" + address + ", email=" + email
				+ "]";
	}
}
