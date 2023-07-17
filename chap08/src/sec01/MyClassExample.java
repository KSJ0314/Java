package sec01;

public class MyClassExample {

	public static void main(String[] args) {

		MyClass mc1 = new MyClass();
		// 디폴트 생성자 호출

		mc1.rc.turnOn();
		mc1.rc.setVolume(7);
		mc1.rc.turnOff();

		System.out.println();

		MyClass mc2 = new MyClass(new Television());
		//
		mc2.rc.turnOn();
		mc2.rc.setVolume(7);
		mc2.rc.turnOff();

		System.out.println();

		MyClass mc3 = new MyClass(new Audio());
		mc3.rc.turnOn();
		mc3.rc.setVolume(7);

		System.out.println();

		MyClass mc4 = new MyClass();
		mc4.methodA();

		System.out.println();

		MyClass mc5 = new MyClass();
		mc5.methodB(new Television());

		System.out.println();
	}

}
