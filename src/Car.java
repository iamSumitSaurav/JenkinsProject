
public class Car extends Vehicle {
	private int noOfPassengers;

	public Car() {
		super();
	}

	public Car(String regno, String company, String color, int noOfPassengers) {
		super(regno, company, color);
		this.noOfPassengers = noOfPassengers;
	}

	public int getNoOfPassengers() {
		return noOfPassengers;
	}

	public void setNoOfPassengers(int noOfPassengers) {
		this.noOfPassengers = noOfPassengers;
	}
	
	public void start() {
		System.out.println("Car is started");
	}
	
	public void accelerate() {
		System.out.println("Car is accelerated");
	}

	@Override
	public void stop() {
		System.out.println("Car is stopped");
		
	}
	
	public void display()
	{
		super.display();
		System.out.println("noOfPassengers");
	}
}
