
public abstract class Medicine {
	private float price;
	private String date;
	
	public Medicine() {
		super();
	}

	public Medicine(float price, String date) {
		super();
		this.price = price;
		this.date = date;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	
	public void getDetails() {
		System.out.println("Price = "+price);
		System.out.println("Expiry Date = "+date);
		
	}
	
	public abstract void displayLabel();
}
