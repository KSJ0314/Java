package sec02;

public class Car {
	Tire frontLeftTire = new HankookTire("�� ����");
	Tire frontRightTire = new HankookTire("�� ������");
	Tire backLeftTire = new HankookTire("�� ����");
	Tire backRightTire = new HankookTire("�� ������");
	// Tire �������̽��� �ڵ� ��ȯ �Ǿ�����
	// �������̵�� roll �޼ҵ�� ������ �Ѿ

	void run() {
		frontLeftTire.roll();
		frontRightTire.roll();
		backLeftTire.roll();
		backRightTire.roll();
	}

	public static void main(String[] args) {

		Car car = new Car();
		car.run();
		car.frontLeftTire = new KumhoTire("�� ����");
		car.run();
		
	}
}
