package sec02;

public class 타입변환예제1 {

	public static void main(String[] args) {

		Car car = new Car();
		Sedan sedan = new Sedan();
		Sonata sonata = new Sonata();
		
		Car car2 = sedan;
		
		Car car3 = sonata;
		
//		Truck truck = sonata;	// 오류
		
		
	}

}
