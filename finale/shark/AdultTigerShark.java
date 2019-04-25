package shark;

/**
 * @author sbeckma2
 *
 */
public class AdultTigerShark extends Shark {

	public AdultTigerShark(String name, int length, int weight) {
		super(name, length, weight);
		
		this.name = name;
		this.weight = length;
		this.weight = weight;
	}
	
	@Override
	public void SharkFood() {
		this.weight += 28;
		System.out.print(name + " ate a turtle and gained 28 pounds.\n");
		System.out.printf("He now weighs %dlbs.\n",weight);
	}

}
