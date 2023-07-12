package sec02.exam01;

public class CarExample {

	public static void main(String[] args) {

		Truck truck = new Truck("흰색", "벤츠", 3, "대");

		Car car = truck;

		car.speedUp(300);
//		car.maxSpeedUp(50);		// car는 truck의 메소드 호출 불가
		System.out.println(car.speed);
		
		car.start();
		truck.start();
	}

}
