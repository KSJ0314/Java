package sec01;

public class Car {

	String company;
	int speed;
	int cost;
	String color;

	public Car() {
		System.out.println("Car 호출");
	}

	public Car(String company, int cost) {
		this.company = company;
		this.cost = cost;
	}

	void speedUp(int speed) {
		this.speed += speed;
		System.out.println("Car의 speed : " + speed);
	}
	
	void stop() {
		System.out.println("Car 멈춤");
	}

	void OldSpeed() {
		OldCar old = new OldCar();
		old.speed = 50;
	}

	class OldCar {
		int speed;
		int cost;

		OldCar() {
			System.out.println("OldCar 호출");
		}

		void speedUp(int speed) {
			this.speed += speed;
			System.out.println("OldCar의 speed : " + speed);
		}
		
		void carCall() {
			company = "현대";
			stop();
		}
	}

	public static class Truck {
		int speed;
		int cost;

		Truck() {
			System.out.println("Truck 호출");
		}

		void speedUp(int speed) {
			this.speed += speed;
			System.out.println("Truck의 speed : " + speed);
		}
		
		void carCall() {
//			company = "현대";
//			stop();
		}
	}

	public static void main(String[] args) {
		Car car = new Car();
		Car.OldCar old = car.new OldCar();
		Car.Truck truck = new Car.Truck();
		
		car.cost = 5000;
		car.speedUp(30);

		old.cost = 3000;
		old.speedUp(50);

		truck.cost = 10000;
		truck.speedUp(20);

		System.out.println(car.cost);
		System.out.println(car.speed);
		System.out.println();
		System.out.println(old.cost);
		System.out.println(old.speed);
		System.out.println();
		System.out.println(truck.cost);
		System.out.println(truck.speed);
		
		
		old.carCall();
		truck.carCall();

	}
}
