package sec04;

public class Car {

	private int speed = 100;

	void powerOn() {
		System.out.println("�õ��� �ɾ����ϴ�.");
	}

	void powerOff() {
		System.out.println("�õ��� �����ϴ�.");
	}
	
	int setSpeed(char a, int speed) {
		switch (a) {
			case '+':
				this.speed += speed;
				break;
			case '-':
				this.speed -= speed;
				break;
			case 'x':
				this.speed = 0;
				break;
			}
		return this.speed;
	}

}
