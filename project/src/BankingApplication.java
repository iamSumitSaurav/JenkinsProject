
public class BankingApplication {

	public static void main(String[] args) {
		Account myAccount = new SavingsAccount(101, "Anita", 2000, "Sunita");
		
		myAccount.display();
		myAccount.withdraw(1500);
		System.out.println("After withdrawal");
		myAccount.display();
		myAccount.deposit(5000);
		System.out.println("Current balance "+myAccount.getBalance());
		myAccount = new CurrentAccount(102, "A & A", 50000, "An12345");
		myAccount.withdraw(47000);
		myAccount.display();
	}

}
