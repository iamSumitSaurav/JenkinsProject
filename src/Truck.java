
public class Truck extends Vehicle {
	float loadingCapacity;

	public Truck() {
		super();
	}

	public Truck(String regno, String company, String color, float loadingCapacity) {
		super(regno, company, color);
		this.loadingCapacity = loadingCapacity;
	}

	public float getLoadingCapacity() {
		return loadingCapacity;
	}

	public void setLoadingCapacity(float loadingCapacity) {
		this.loadingCapacity = loadingCapacity;
	}
	
	public void start() {
		System.out.println("Truck is started");
	}
	
	public void stop() {
		System.out.println("Truck is stopped");
	}
	
	public void accelerate() {
		System.out.println("Truck is accelerated");
	}
	
	public void display() {
		super.display();
		System.out.println(loadingCapacity);
	}
}
