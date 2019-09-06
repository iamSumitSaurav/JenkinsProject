
public class CurrentAccount extends Account{
	private String crn;

	public CurrentAccount() {
		super();
	}

	public CurrentAccount(int acno, String name, float balance, String crn) {
		super(acno, name, balance);
		this.crn = crn;
	}

	public String getCrn() {
		return crn;
	}

	public void setCrn(String crn) {
		this.crn = crn;
	}
	
	public void withdraw(float amt) {
		float rem_bal = getBalance();
		if(rem_bal-amt >= 5000) {
			rem_bal -= amt;
			setBalance(rem_bal);
		}
		else {
			System.out.println("Insufficient Balance");
		}
	}
	
	public void display() {
		super.display();
		System.out.println("CRN : "+crn);
	}	
}
