/**
 * @author sbeckma2
 *
 */
package shark;

public abstract class Shark {
	protected String name;
	protected int length;
	protected int weight;
	
	public Shark(String name, int length, int weight) {
		this.name = name;
		this.length = length;
		this.weight = weight;
	}
	public String getName() {
		return this.name;
	}
	
	public int getLength() {
		return this.length;
	}
	
	public int getWeight() {
		return this.weight;
	}
	
	public void setName(String input) {
		this.name = input;
	}
	
	public void setLength(int input) {
		this.length = input;
	}
	
	public void setWeight(int input) {
		this.weight = input;
	}
	
	public void SharkFood() {
		this.weight += 35;
	}

	@Override
	public String toString() {
		return name + " the shark is " + length + "ft long and weighs " + weight + "lbs.";
	}
	
}
