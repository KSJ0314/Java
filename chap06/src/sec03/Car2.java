package sec03;

public class Car2 {
	String company = "�����ڵ���"; // ����ȸ��
	String model; // �𵨸�
	String color; // ����
	int maxSpeed; // �ְ�ӵ�

	Car2() {
	}

	public Car2(String model) {
		this(model, "����");
	}

	public Car2(String model, String color) {
		this(model, color, 250);
	}

	public Car2(String model, String color, int maxSpeed) {
		this("�����ڵ���", model, color, maxSpeed);
	}

	public Car2(String company, String model, String color, int maxSpeed) {
		this.company = company;
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}

}
