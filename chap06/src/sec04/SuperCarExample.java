package sec04;

public class SuperCarExample {

	public static void main(String[] args) throws InterruptedException {

		SuperCar superCar = new SuperCar();

		superCar.keyTurnOn();
		superCar.run();
		int speed = superCar.getSpeed();
		System.out.printf("���� �ӵ� : %dkm/h\n", speed);

	}

}
