package people;

public class Faculty extends Employee {
	int officeHours;
	String rank;
	
	
	public Faculty(String name, String phoneNumber, String address, String email, String office, int salary, String dateHired,
			int officeHours, String rank) {
		super(name, phoneNumber, address, email, office, salary, dateHired);
		
		this.officeHours = officeHours;
		this.rank = rank;
	}

}
