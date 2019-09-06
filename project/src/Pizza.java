
public class Pizza {
	private String type;
	private String toppings;
	private String name;
	private float timeForPreparation;
	
	public Pizza() {
		super();
	}
	
	public Pizza(String type, String toppings, String name, float timeForPreparation) {
		super();
		this.type = type;
		this.toppings = toppings;
		this.name = name;
		this.timeForPreparation = timeForPreparation;
		
		//if(this.type != "Veg" || this.type != "Non Veg") {
			//System.out.println("Invalid type");
		//}
	}
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getToppings() {
		return toppings;
	}

	public void setToppings(String toppings) {
		this.toppings = toppings;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getTimeForPreparation() {
		return timeForPreparation;
	}

	public void setTimeForPreparation(float timeForPreparation) {
		this.timeForPreparation = timeForPreparation;
	}

	public void display() {
		System.out.println("Your order details are :");
		System.out.println("Pizza Type : "+type);
		System.out.println("Toppings : "+toppings);
		System.out.println("Name : "+name);
		System.out.println("Time for preparation : "+timeForPreparation);
	}	

}
