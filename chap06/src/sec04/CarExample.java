package sec04;

public class CarExample {

	public static void main(String[] args) {

		Car car = new Car();
		car.powerOn();
		System.out.printf("���� �ӵ��� %3dkm/s�Դϴ�.\n", car.setSpeed('+', 30));
		System.out.printf("���� �ӵ��� %3dkm/s�Դϴ�.\n", car.setSpeed('+', 20));
		System.out.printf("���� �ӵ��� %3dkm/s�Դϴ�.\n", car.setSpeed('-', 70));
		System.out.printf("���� �ӵ��� %3dkm/s�Դϴ�.\n", car.setSpeed('x', 0));
		car.powerOff();

	}

}
