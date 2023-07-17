package sec01.exam01;

public class CarExample {

	public static void main(String[] args) {

		Car car = new Truck(100);
		car.speedUp(30);
		car.speedUp(300);
		car.speedDown(30);
		car.speedDown(300);

		car = new SportCar(100);
		car.speedUp(50);
		car.speedDown(20);
		
	}

}
