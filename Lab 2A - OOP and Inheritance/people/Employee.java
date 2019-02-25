package people;

public class Employee extends Person {
	String office, dateHired;
	int salary;
	
	public Employee(String name, String phoneNumber, String address, String email, String office, int salary, String dateHired) {
		super(name, phoneNumber, address, email);
		
		this.office = office;
		this.salary = salary;
		this.dateHired = dateHired;
	}

	@Override
	public String toString() {
		return "Employee [office=" + office + ", dateHired=" + dateHired + ", salary=" + salary + "]";
	}

}
