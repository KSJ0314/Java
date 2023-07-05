package sec03;

public class 자동차예제1 {

	public static void main(String[] args) {

		Car car = new Car("제네시스", 200);
		Car car2 = new Car();
		car2.model = "그렌저";
		System.out.println(car.model);
		System.out.println(car.speed);
		System.out.println(car.company);
		System.out.println();
		System.out.println(car2.model);
		System.out.println(car2.speed);
		System.out.println(car2.company);

	}

}
