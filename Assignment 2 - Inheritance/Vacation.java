public abstract class Vacation{
	protected int budget;
	protected String destination;
	
	public Vacation(String destination, int budget){
		this.destination = destination;
		this.budget = budget;
	}
	
	public abstract int getBudgetDiff(){
		int totalCost = budget - cost;
		return totalCost;
	}
}

public class allInclusive extends Vacation{
	private String brand;
	private int rating, cost;
	
	public allInclusive(String destination, int budget, String brand, int rating, int cost){ 
		super(destination, budget);
		
		this.brand = brand;
		this.rating = rating;
		this.cost = cost;
		
		@Override
		public int getBudgetDiff(){
			int totalCost = budget - cost;
			return totalCost;
		}
	}		
}

public class pieceMeal extends Vacation(){
	int hotel, meal, airfare;
	
	public pieceMeal(String destination, int budget, int hotel, int meal, int airfare){
		super(destination, budget);
		
		this.hotel = hotel;
		this.meal = meal;
		this.airfare = airfare;
		
		@Override 
		public int getBudgetDiff(){
			int totalCost = budget-(hotel+meal+airfare);
			return totalCost;
		}
	}
}