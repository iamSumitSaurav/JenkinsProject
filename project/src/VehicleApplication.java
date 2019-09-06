
public class VehicleApplication {

	public static void main(String[] args) {
		/*
		 * Vehicle vehicle = new Car("AS1234", "Maruti", "White", 5); vehicle.start();
		 * vehicle.stop(); vehicle.accelerate();
		 * 
		 * vehicle = new Truck("AW456", "Mahindra", "Green", 20); vehicle.start();
		 * vehicle.stop(); vehicle.accelerate();
		 */
		
		Vehicle vArr[] = new Vehicle[3];
		vArr[0] = new Car("Ab123", "Maruti", "White", 5);
		vArr[1] = new Car("Ca234", "Hyundai", "Red", 4);
		vArr[2] = new Truck("QW3456", "Mahindra", "Blue", 6);
		
		//for(int i = 0; i < vArr.length; i++)
			//vArr[i].display();
		
		for(Vehicle v: vArr) {
			v.display();
		}
	}

}
