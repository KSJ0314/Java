package sec03;

public class PhoneExample {

	public static void main(String[] args) {

//		Phone phone = new Phone("홍길동");	// 추상클래스는 객체 생성 불가

		SmartPhone sp = new SmartPhone("홍길동");
		sp.trunOn();
		sp.internetSearch();
	}
	
}
