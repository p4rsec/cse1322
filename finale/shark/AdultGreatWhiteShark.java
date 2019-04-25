package shark;

public class AdultGreatWhiteShark extends Shark{
	
	public AdultGreatWhiteShark(String name, int length, int weight) {
		super(name, length, weight);
		
		this.name = name;
		this.length = length;
		this.weight = weight;
	}
	
	@Override
	public void SharkFood() {
		this.weight += 47;
		System.out.print(name + " ate a tuna and gained 47 pounds.\n");
		System.out.printf("He now weighs %dlbs.\n",weight);
	}
}
