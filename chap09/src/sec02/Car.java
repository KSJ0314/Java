package sec02;

public class Car {
	String company;
	String color;
	int speed = 100;
	int cost;
	
	void stop() {
		System.out.println("차가 멈춥니다.");
	}

	void stopMethod(Car car) {
		car.stop();
	}
	
	class Car2{
		Car car2 = new Car() {
			void speedUp(int speed) {
				this.speed+=speed;
				System.out.println("속도는 " + this.speed + "입니다.");
			}
			@Override
			void stop() {
				System.out.println("Truck이 멈춥니다.");
				speedUp(20);
			}
		};
	}
	
	void speedDown() {
		Car downCar = new Car() {
			
			@Override
			void stop() {
				this.speed -= 20;
				System.out.println("속도가 내려갔습니다. "+this.speed);
				super.stop();
			}
			
		};
		downCar.stop();
	}

}
