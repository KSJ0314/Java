package sec03;

public class Car {
	String company;
	String model;
	String color;
	int maxSpeed;
	int speed;

	public Car() {
	}

	public Car(String model, int speed) {
		this.model = model;
		this.speed = speed;
	}
	
	public Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}

}
