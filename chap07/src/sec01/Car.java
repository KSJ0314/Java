package sec01;

public class Car {

	private String company = "현대"; // 제조회사
	String year; // 제조년도
	String price; // 가격
	int maxSpeed; // 최고속도
	int speed;

	void powerOn() {
		System.out.println("시동을 켭니다.");
	}

	void powerOff() {
		System.out.println("시동을 끕니다.");
	}

	void run() {
		System.out.println(speed + "km/h로 운행합니다.");
	}

	void speedUp(int speed) {
		if (this.speed + speed <= maxSpeed) {
			this.speed += speed;
			System.out.println(this.speed + "km/h로 운행합니다.");
		} else {
			System.out.println("최고속도를 초과할 수 없습니다.");
		}
	}

	public String getCompany() {
		String message = "제조회사는 \"" + company + "\"입니다.";
		return message;
	}

}
