package sec03;

public class 자동차예제3 {

	public static void main(String[] args) {

//		Car2 car2 = new Car2();
//		System.out.printf("모델명 : %s\n", car2.company);
		
		Car2 car2 = new Car2("자가용");
		System.out.printf("제조회사 : %s\n", car2.company);
		System.out.printf("모델명 : %s\n", car2.model);
		System.out.printf("색상 : %s\n", car2.color);
		System.out.printf("최고속도 : %s\n", car2.maxSpeed);
		
//		System.out.printf("최고속도 : %d\n", car2.maxSpeed);
		
		Car2 car3;
		
	}

}
