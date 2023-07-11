package sec01;

public class SuperCarExample {

	public static void main(String[] args) {

		SuperCar superCar = new SuperCar("300,000,000", 300, 200);

		System.out.println("superCar의 가격은 " + superCar.price + "원 입니다.");
		System.out.println("superCar의 최고 속도는 " + superCar.maxSpeed + "km/h 입니다.");

		System.out.println(superCar.getCompany());

		superCar.run();

		superCar.speedUp(50);	// 부모클래스 메서드
		superCar.booster(50);	// 자식클래스 메서드
		superCar.speedUp(50);
		superCar.speedUp(50);
		superCar.speedUp(50);
		superCar.booster(50);
		superCar.booster(50);
		superCar.booster(50);

	}

}
