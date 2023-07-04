package sec02;

public class 자동차예제1 {

	public static void main(String[] args) {

		Car myCar = new Car();
		Car myCar2 = new Car();

		System.out.printf("회사 이름 : %s\n", myCar.company);
		System.out.printf("모델명 : %s\n", myCar.model);

		myCar.company = "페라리";
		myCar.model = "아벤타도르";

		System.out.printf("회사 이름 : %s\n", myCar.company);
		System.out.printf("모델명 : %s\n", myCar.model);

	}

}
