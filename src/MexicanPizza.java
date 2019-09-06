
public class MexicanPizza extends Pizza {
	public MexicanPizza() {
		super();
	}

	public MexicanPizza(String type, String toppings, String name) {
		super(type, toppings, name, 15);
	}
	
	public void display() {
		System.out.println("Mexican Pizza details are : "+getType()+" "+getName()+" Pizza with "+getToppings()+" which takes"+getTimeForPreparation()+ " mins to complete.");
	}

}
