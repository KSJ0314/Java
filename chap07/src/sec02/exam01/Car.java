package sec02.exam01;

public class Car {

	String color; // �ڵ��� ����
	String company; // ����ȸ��
	int speed; // �ӵ�
	int cost; // ����
	
	public Car() {
	}

	// �Ű����� 2���� ������(����, ����ȸ�� ����)
	public Car(String color, String company) {
		this.color = color;
		this.company = company;
	}

	void speedUp(int speed) {
		this.speed += speed;
	}
	
	void speedDown(int speed) {
		this.speed -= speed;
	}
	
	void start() {
		System.out.println("���� ����߽��ϴ�.");
	}
	
	void stop() {
		System.out.println("���� ����ϴ�.");
	}

}
