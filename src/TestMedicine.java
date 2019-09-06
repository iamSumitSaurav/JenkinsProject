
public class TestMedicine {

	public static void main(String[] args) {
		Medicine medicine = new Tablet(45.5f, "tablet");
		medicine.displayLabel();
		medicine = new Syrup(45.5f, "tablet");
		medicine.displayLabel();
		medicine = new Ointment(45.5f, "tablet");
		medicine.displayLabel();
	}

}
