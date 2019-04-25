package shark;

/**
 * @author sbeckma2
 *
 */
public class BabyTigerShark extends AdultTigerShark {

	public BabyTigerShark(String name, int length, int weight) {
		super(name, length, weight);
		
		
	}
	
	@Override
	public void SharkFood() {
		this.weight += 16;
		System.out.print(name + " ate a turtle and gained 16 pounds.\n");
		System.out.printf("He now weighs %dlbs.\n",weight);
	}
}
