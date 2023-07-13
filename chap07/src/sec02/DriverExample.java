package sec02;

public class DriverExample {

	public static void main(String[] args) {

		Driver driver = new Driver();
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		bus.run();
		taxi.run();
		
		System.out.println();

		driver.drive(new Vehicle());
		driver.drive(bus);
		driver.drive(taxi);

	}

}
