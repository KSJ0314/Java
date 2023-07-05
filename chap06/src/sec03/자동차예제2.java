package sec03;

public class 자동차예제2 {

	public static void main(String[] args) {

//		Car car = new Car("BMW750i", 250);
//
//		System.out.printf("모델명 : %s\n", car.model);
//		System.out.printf("속도 : %d\n", car.speed);
//		System.out.printf("제조회사 : %s\n", car.company);

		Car car2 = new Car("테슬라3", "빨강", 350);
		System.out.printf("모델명 : %s\n", car2.model);
		System.out.printf("색상 : %s\n", car2.color);
		System.out.printf("최고속도 : %d\n", car2.maxSpeed);
	}

}
