package sec02;

public class CarExample {

	public static void main(String[] args) {

		Car car = new Car();
		car.stop();	
		
		car.stopMethod(new Car(){
			void speedUp(int speed) {
				this.speed+=speed;
				System.out.println("�ӵ��� " + this.speed + "�Դϴ�.");
			}
			@Override
			void stop() {
				System.out.println("Truck�� ����ϴ�.");
				speedUp(20);
			}
			
		});
		
		Car.Car2 truck = new Car().new Car2();
		truck.car2.stop();
		
		
		car.speedDown();
	}

}
