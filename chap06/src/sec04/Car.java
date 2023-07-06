package sec04;

public class Car {

	private int speed = 100;

	void powerOn() {
		System.out.println("시동을 걸었습니다.");
	}

	void powerOff() {
		System.out.println("시동을 껐습니다.");
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
