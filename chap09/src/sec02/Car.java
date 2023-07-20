package sec02;

public class Car {
	String company;
	String color;
	int speed = 100;
	int cost;
	
	void stop() {
		System.out.println("���� ����ϴ�.");
	}

	void stopMethod(Car car) {
		car.stop();
	}
	
	class Car2{
		Car car2 = new Car() {
			void speedUp(int speed) {
				this.speed+=speed;
				System.out.println("�ӵ��� " + this.speed + "�Դϴ�.");
			}
			@Override
			void stop() {
				System.out.println("Truck�� ����ϴ�.");
				speedUp(20);
			}
		};
	}
	
	void speedDown() {
		Car downCar = new Car() {
			
			@Override
			void stop() {
				this.speed -= 20;
				System.out.println("�ӵ��� ���������ϴ�. "+this.speed);
				super.stop();
			}
			
		};
		downCar.stop();
	}

}
