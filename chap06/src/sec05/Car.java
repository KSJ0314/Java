package sec05;

public class Car {

	// 필드 선언
	String model;
	int speed;

	// 기본생성자
	Car() {

	}

	// 매개변수 1개 생성자, 기본생성자 생성x
	Car(String model) {
		this.model = model;
	}

	// 매개변수 1개 메소드, 리턴값 없음
	void setSpeed(int speed) {
		this.speed = speed;
	}

	// 매개변수 없는 메소드, 리턴값 없음
	// 1*10부터 5*10까지 5번 반복해서 속도를 대입, 출력
	void run() {
		for (int i = 1; i <= 5; i++) {
			this.setSpeed(i * 10);
			System.out.printf("%s가 달립니다.(시속:%dkm/h)\n", this.model, this.speed);
		}
	}

	public static void main(String[] args) {
		Car myCar = new Car("벤틀리");
		myCar.run();

		Car yourCar = new Car();
		yourCar.speed = 10;
		
		yourCar.run();
		
		
		
	}
}
