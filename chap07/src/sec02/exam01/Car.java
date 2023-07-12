package sec02.exam01;

public class Car {

	String color; // 자동차 색상
	String company; // 제조회사
	int speed; // 속도
	int cost; // 가격
	
	public Car() {
	}

	// 매개변수 2개인 생성자(색상, 제조회사 지정)
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
		System.out.println("차가 출발했습니다.");
	}
	
	void stop() {
		System.out.println("차를 멈춥니다.");
	}

}
