package sec01;

public class SuperCarExample {

	public static void main(String[] args) {

		SuperCar superCar = new SuperCar("300,000,000", 300, 200);

		System.out.println("superCar�� ������ " + superCar.price + "�� �Դϴ�.");
		System.out.println("superCar�� �ְ� �ӵ��� " + superCar.maxSpeed + "km/h �Դϴ�.");

		System.out.println(superCar.getCompany());

		superCar.run();

		superCar.speedUp(50);	// �θ�Ŭ���� �޼���
		superCar.booster(50);	// �ڽ�Ŭ���� �޼���
		superCar.speedUp(50);
		superCar.speedUp(50);
		superCar.speedUp(50);
		superCar.booster(50);
		superCar.booster(50);
		superCar.booster(50);

	}

}
