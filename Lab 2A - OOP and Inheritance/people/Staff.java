package people;

public class Staff extends Employee {
	String title;
	
	
	public Staff(String name, String phoneNumber, String address, String email, String office, int salary, String dateHired, String title) {
		super(name, phoneNumber, address, email, office, salary, dateHired);
		
		this.title = title;
	}

}
