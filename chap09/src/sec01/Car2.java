package sec01;

public class Car2 {

	String company;
	int speed;
	int cost;
	String color;

	public Car2() {
	}

	public Car2(String company, int cost) {
		this.company = company;
		this.cost = cost;
	}

	void speedUp(int speed) {
		this.speed += speed;
		System.out.println("Car의 speed : " + speed);
	}
	
	void OldSpeed() {
		OldCar2 old = new OldCar2();
		old.speed = 50;
	}

	public static class OldCar2 {
		int speed;
		int cost;

		void speedUp(int speed) {
			this.speed += speed;
			System.out.println("OldCar의 speed : " + speed);
		}
	}
	
	public static void main(String[] args) {
		Car2 car = new Car2("현대",30000);
		car.speedUp(20);

		Car2.OldCar2 old = new Car2.OldCar2();
		old.speedUp(30);
	}
}
