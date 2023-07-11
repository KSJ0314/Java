package sec01;

public class SuperCar extends Car {
	
	
	SuperCar (String price, int maxSpeed, int speed) {
		this.price = price;
		this.maxSpeed = maxSpeed;
		this.speed = speed;
	}
	
	void booster(int speed) {
		System.out.print("부스터On | ");
		this.speed += speed;
		System.out.println(this.speed + "km/h로 운행합니다.");
	}
	
}
