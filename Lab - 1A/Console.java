// Seth Beckman
import java.util.Scanner;
class Console {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age;
		String name;
		
		System.out.print("Please enter your name: ");
		name = sc.nextLine();
		System.out.print("Please enter your age: ");
		age = sc.nextInt();
		
		System.out.printf("Hello, %s! I see you're %d years old!",name,age);
	}
}