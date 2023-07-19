package sec01;

public class Car {

	String company;
	int speed;
	int cost;
	String color;

	public Car() {
		System.out.println("Car ȣ��");
	}

	public Car(String company, int cost) {
		this.company = company;
		this.cost = cost;
	}

	void speedUp(int speed) {
		this.speed += speed;
		System.out.println("Car�� speed : " + speed);
	}
	
	void stop() {
		System.out.println("Car ����");
	}

	void OldSpeed() {
		OldCar old = new OldCar();
		old.speed = 50;
	}

	class OldCar {
		int speed;
		int cost;

		OldCar() {
			System.out.println("OldCar ȣ��");
		}

		void speedUp(int speed) {
			this.speed += speed;
			System.out.println("OldCar�� speed : " + speed);
		}
		
		void carCall() {
			company = "����";
			stop();
		}
	}

	public static class Truck {
		int speed;
		int cost;

		Truck() {
			System.out.println("Truck ȣ��");
		}

		void speedUp(int speed) {
			this.speed += speed;
			System.out.println("Truck�� speed : " + speed);
		}
		
		void carCall() {
//			company = "����";
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
