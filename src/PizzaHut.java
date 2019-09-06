import java.util.Scanner;
public class PizzaHut {

	public static void main(String[] args) {
		System.out.println("Welcome to Pizza Hut");
		
		while(true) {
			String choice;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your choice between Mexican or Italian");
			choice = sc.next();
			switch(choice) {
			case "Italian" : Pizza p = new ItalianPizza("Veg", "Mushroom", choice);
						   	 p.display();
						   	 break;
						   
			case "Mexican" : Pizza q = new MexicanPizza("Non-Veg", "Olive", choice);
			   			   	 q.display();
			   			   	 break;
			   			   
			default : System.out.println("Such Pizza is not available");
			
			}
			String x;
			System.out.println("Do you want to enter again? (y/n)");
			x = sc.next();
			if(x == "n")
				System.exit(0);
		}
	}

}
