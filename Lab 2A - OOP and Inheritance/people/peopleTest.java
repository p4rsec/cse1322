package people;

public class peopleTest {
	public void main(String args[]) {
		Person Jack = new Person("Jack", "1-800-EMPIRE", "123 Main Street", "jacc@aol.com");
		Student Billy = new Student("Billy", "123-456-7892", "123 Ray Street", "billybowillybananafannafofilly@aol.com", "Fresh Meat");
		Employee Susan = new Employee("Susan", "123-456-7895", "123 Susan Street", "Room 420", "40,000", "1-4-2007");
		
		System.out.println(Jack);
		System.out.println(Billy);
		System.out.println(Susan);
	}
}
