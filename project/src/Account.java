
public class Account {
	private int acno;
	private String name;
	private float balance;
	public Account() {
		super();
	}
	public Account(int acno, String name, float balance) {
		super();
		this.acno = acno;
		this.name = name;
		this.balance = balance;
	}
	public int getAcno() {
		return acno;
	}
	public void setAcno(int acno) {
		this.acno = acno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	
	public void display() {
		System.out.println("Account No : "+acno);
		System.out.println("Name : "+name);
		System.out.println("Balance : "+balance);
	}
	
	public void withdraw(float amt) {
		this.balance -= amt;
	}
	
	public void deposit(float amt) {
		this.balance += amt;
	}
}
