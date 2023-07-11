package sec01.exam02;

public class Car {
	String model; // 모델명
	String company; // 제조회사
	int cost; // 가격
	int fuel; // 연비
	int speed;	// 속도

	public Car(String model, String company) {
		// 매개변수 2개 사용하는 생성자
		this.model = model;
		this.company = company;
	}

	void powerOn() {
		System.out.println("시동을 켭니다.");
	}

	void powerOff() {
		System.out.println("시동을 끕니다.");
	}
	
	void speedUp(int speed) {
		System.out.println(speed + "만큼 속도를 증가합니다.");
		this.speed += speed;
	}
	
	void speedDown(int speed) {
		System.out.println(speed + "만큼 속도를 증가합니다.");
		this.speed -= speed;
	}

}
