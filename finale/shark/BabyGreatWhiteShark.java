package shark;

/**
 * @author sbeckma2
 *
 */
public class BabyGreatWhiteShark extends AdultGreatWhiteShark {

	public BabyGreatWhiteShark(String name, int length, int weight) {
		super(name, length, weight);
		
		this.name = name;
		this.length = (length/2);
		this.weight = (weight/2);
	}
	
	@Override
	public void SharkFood() {
		this.weight += 26;
		System.out.print(name + " ate a tuna and gained 26 pounds.\n");
		System.out.printf("He now weighs %dlbs.\n",weight);
	}
}
