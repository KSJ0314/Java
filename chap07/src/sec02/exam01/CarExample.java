package sec02.exam01;

public class CarExample {

	public static void main(String[] args) {

		Truck truck = new Truck("���", "����", 3, "��");

		Car car = truck;

		car.speedUp(300);
//		car.maxSpeedUp(50);		// car�� truck�� �޼ҵ� ȣ�� �Ұ�
		System.out.println(car.speed);
		
		car.start();
		truck.start();
	}

}
