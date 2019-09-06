
public abstract class Vehicle {
	private String regno;
	private String company;
	private String color;
	
	public Vehicle() {
		super();
	}

	public Vehicle(String regno, String company, String color) {
		super();
		this.regno = regno;
		this.company = company;
		this.color = color;
	}

	public String getRegno() {
		return regno;
	}

	public void setRegno(String regno) {
		this.regno = regno;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public abstract void start();
	
	public abstract void stop();
	
	public abstract void accelerate();
	
	public void display() {
		System.out.println("regno "+regno+ "company" +company+ " color"+ color);
	}
}
