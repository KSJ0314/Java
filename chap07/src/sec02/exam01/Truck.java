package sec02.exam01;

public class Truck extends Car {

	int weight; // ���緮
	String trunkSize; // Ʈ��ũ ������ ex) ��,��,��
	int maxSpeed; // �ִ� �ӵ�

	public Truck(String color, String company, int weight, String trunkSize) {
		super(color, company);
		this.weight = weight;
		this.trunkSize = trunkSize;
	}

	void maxSpeedUp(int maxSpeed) {
		this.maxSpeed += maxSpeed;
	}

	@Override
	void start() {
		System.out.println("Ʈ���� ����߽��ϴ�.");
	}
	
	void superStart() {
		super.start();
	}

	@Override
	void stop() {
		System.out.println("Ʈ���� ����ϴ�.");
	}

	
	
}
