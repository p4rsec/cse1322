package arrList;


import java.util.ArrayList;
import java.util.Scanner;
/**
 * @author sbeckma2
 *
 */
public class RecursiveArrList {
	public static int recursiveAdd(ArrayList<Integer> arrList, int index) {
		int sum = 0;
		while(index<15) {
		if(index == 15)
			break;
		sum += arrList.get(index);
		index++;
		recursiveAdd(arrList, index);
		continue;
		}
		
		return sum;
	}
	
	public static void main(String args[]) throws ArrayIndexOutOfBoundsException{
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		System.out.println("Please enter 15 numbers to populate the ArrayList.");
		Scanner sc = new Scanner(System.in);
		// exception handling for getting user input for arrList
		try {
			for(int i=0;i<15;i++) {
				System.out.printf("Number %d: ", i+1);
				int input = sc.nextInt();
				arrList.add(i, input);
				System.out.println();
			}
		}
		catch (Exception e) {
		       System.out.println(e);
		       System.out.println("Something went wrong...");
		   }
		finally {
			sc.close(); // always want to close the scanner, even if we catch an exception
		}
		
		int sum = recursiveAdd(arrList, 0);
		System.out.println(arrList);
		System.out.println("The sum of the ArrayList is "+ sum);
	}

}
