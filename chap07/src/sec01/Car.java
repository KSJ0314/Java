package sec01;

public class Car {

	private String company = "����"; // ����ȸ��
	String year; // �����⵵
	String price; // ����
	int maxSpeed; // �ְ�ӵ�
	int speed;

	void powerOn() {
		System.out.println("�õ��� �մϴ�.");
	}

	void powerOff() {
		System.out.println("�õ��� ���ϴ�.");
	}

	void run() {
		System.out.println(speed + "km/h�� �����մϴ�.");
	}

	void speedUp(int speed) {
		if (this.speed + speed <= maxSpeed) {
			this.speed += speed;
			System.out.println(this.speed + "km/h�� �����մϴ�.");
		} else {
			System.out.println("�ְ�ӵ��� �ʰ��� �� �����ϴ�.");
		}
	}

	public String getCompany() {
		String message = "����ȸ��� \"" + company + "\"�Դϴ�.";
		return message;
	}

}
