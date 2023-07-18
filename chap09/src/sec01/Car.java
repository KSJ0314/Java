package sec01;

public class Car {

	String company;
	int speed;
	int cost;
	String color;

	public Car() {
	}

	public Car(String company, int cost) {
		this.company = company;
		this.cost = cost;
	}

	void speedUp(int speed) {
		this.speed += speed;
		System.out.println("Car�� speed : " + speed);
	}
	
	void OldSpeed() {
		OldCar old = new OldCar();
		old.speed = 50;
	}

	class OldCar {
		int speed;
		int cost;

		void speedUp(int speed) {
			this.speed += speed;
			System.out.println("OldCar�� speed : " + speed);
		}
	}
	
	public static void main(String[] args) {
		Car car = new Car("����",30000);
		car.speedUp(20);
		
		Car.OldCar old = car.new OldCar();
		old.speedUp(30);
	}
}
