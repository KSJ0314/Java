package sec02;

public class CarExample {

	public static void main(String[] args) {

		Car car = new Car();
		car.stop();	
		
		car.stopMethod(new Car(){
			void speedUp(int speed) {
				this.speed+=speed;
				System.out.println("속도는 " + this.speed + "입니다.");
			}
			@Override
			void stop() {
				System.out.println("Truck이 멈춥니다.");
				speedUp(20);
			}
			
		});
		
		Car.Car2 truck = new Car().new Car2();
		truck.car2.stop();
		
		
		car.speedDown();
	}

}
