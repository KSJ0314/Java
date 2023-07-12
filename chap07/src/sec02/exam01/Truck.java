package sec02.exam01;

public class Truck extends Car {

	int weight; // 적재량
	String trunkSize; // 트렁크 사이즈 ex) 대,중,소
	int maxSpeed; // 최대 속도

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
		System.out.println("트럭이 출발했습니다.");
	}
	
	void superStart() {
		super.start();
	}

	@Override
	void stop() {
		System.out.println("트럭을 멈춥니다.");
	}

	
	
}
