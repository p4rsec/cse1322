package shark;

/**
 * @author sbeckma2
 *
 */
public class Sharky_Test {

	public static void main(String args[]) {
		AdultGreatWhiteShark Bob = new AdultGreatWhiteShark("Bob", 18, 2200);
		AdultTigerShark Bill = new AdultTigerShark("Bill", 12, 1350);
		BabyGreatWhiteShark Oscar = new BabyGreatWhiteShark("Oscar", Bob.getLength(), Bob.getWeight());
		BabyTigerShark Edboy = new BabyTigerShark("Edboy", Bill.getLength(), Bill.getWeight());
		
		System.out.println(Bob);
		Bob.SharkFood();
		System.out.println();
		
		System.out.println(Bill);
		Bill.SharkFood();
		System.out.println();
		
		System.out.println(Oscar);
		Oscar.SharkFood();
		System.out.println();
		
		System.out.println(Edboy);
		Edboy.SharkFood();
		System.out.println();
	}

}
