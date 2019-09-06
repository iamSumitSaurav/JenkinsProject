
public class ItalianPizza extends Pizza{

	public ItalianPizza() {
		super();
	}

	public ItalianPizza(String type, String toppings, String name) {
		super(type, toppings, name, 10);
	}
	
	public void display() {
		System.out.println("Italian Pizza details are : "+getType()+" "+getName()+" Pizza with "+getToppings()+" which takes"+getTimeForPreparation()+ " mins to complete.");
	}
}
