
public class SavingsAccount extends Account{
	private String nominee;

	public SavingsAccount() {
		super();
	}

	public SavingsAccount(int acno, String name, float balance, String nominee) {
		super(acno, name, balance);
		this.nominee = nominee;
	}

	public String getNominee() {
		return nominee;
	}

	public void setNominee(String nominee) {
		this.nominee = nominee;
	}
	
	public void withdraw(float amt) {
		float m_balance = getBalance();
		if(m_balance-amt >= 1000) {
			m_balance -= amt;
			setBalance(m_balance);
		}
		else {
			System.out.println("Insufficient Balance");
		}
	}
	public void display() {
		super.display();
		System.out.println("Nominee : "+nominee);
	}
	
}
