package sec05;

public class Car {

	// �ʵ� ����
	String model;
	int speed;

	// �⺻������
	Car() {

	}

	// �Ű����� 1�� ������, �⺻������ ����x
	Car(String model) {
		this.model = model;
	}

	// �Ű����� 1�� �޼ҵ�, ���ϰ� ����
	void setSpeed(int speed) {
		this.speed = speed;
	}

	// �Ű����� ���� �޼ҵ�, ���ϰ� ����
	// 1*10���� 5*10���� 5�� �ݺ��ؼ� �ӵ��� ����, ���
	void run() {
		for (int i = 1; i <= 5; i++) {
			this.setSpeed(i * 10);
			System.out.printf("%s�� �޸��ϴ�.(�ü�:%dkm/h)\n", this.model, this.speed);
		}
	}

	public static void main(String[] args) {
		Car myCar = new Car("��Ʋ��");
		myCar.run();

		Car yourCar = new Car();
		yourCar.speed = 10;
		
		yourCar.run();
		
		
		
	}
}
