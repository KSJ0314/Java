package sec04;

public class CarExample {

	public static void main(String[] args) {

		Car car = new Car();
		car.powerOn();
		System.out.printf("현재 속도는 %3dkm/s입니다.\n", car.setSpeed('+', 30));
		System.out.printf("현재 속도는 %3dkm/s입니다.\n", car.setSpeed('+', 20));
		System.out.printf("현재 속도는 %3dkm/s입니다.\n", car.setSpeed('-', 70));
		System.out.printf("현재 속도는 %3dkm/s입니다.\n", car.setSpeed('x', 0));
		car.powerOff();

	}

}
