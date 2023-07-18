package sec02;

public class AExample {

	public static void main(String[] args) {

		A a = new A();
		
		A.B b = new A().new B();
		b.hi();
		
	}

}
