package sec03;

public class Car2 {
	String company = "현대자동차"; // 제조회사
	String model; // 모델명
	String color; // 색상
	int maxSpeed; // 최고속도

	Car2() {
	}

	public Car2(String model) {
		this(model, "은색");
	}

	public Car2(String model, String color) {
		this(model, color, 250);
	}

	public Car2(String model, String color, int maxSpeed) {
		this("현대자동차", model, color, maxSpeed);
	}

	public Car2(String company, String model, String color, int maxSpeed) {
		this.company = company;
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}

}
