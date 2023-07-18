package sec02;

public class Driver {

	
	public void drive(Vehicle vehicle) {
		vehicle.run();
	}
	
	
	public static void main(String[] args) {

		Driver driver = new Driver();
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		driver.drive(bus);
		driver.drive(taxi);
		

	}

}
