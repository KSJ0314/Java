package sec03;

public class �ڵ�������1 {

	public static void main(String[] args) {

		Car car = new Car("���׽ý�", 200);
		Car car2 = new Car();
		car2.model = "�׷���";
		System.out.println(car.model);
		System.out.println(car.speed);
		System.out.println(car.company);
		System.out.println();
		System.out.println(car2.model);
		System.out.println(car2.speed);
		System.out.println(car2.company);

	}

}
