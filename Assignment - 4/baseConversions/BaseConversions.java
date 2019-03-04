package baseConversions;


import java.util.*;
public class BaseConversions {

	public static String convertBase(int input, int base) {
		char chars[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 
				'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 
				'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
		String converted = "";

		if(input != 0) {
			converted = convertBase(input / base, base) + chars[input % base];
		}
		return converted;
	}
	
	public static void main(String[] args) {
		int input, base;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter the base 10 number to convert: ");
		input = sc.nextInt();
		System.out.println("Please enter the desired base: ");
		base = sc.nextInt();
		sc.close();
		
		String converted = convertBase(input, base);
		System.out.printf("The number %d in base %d is %s.", input, base, converted);
	}
}