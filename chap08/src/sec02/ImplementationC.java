package sec02;

public class ImplementationC implements InterfaceC {

	public void methodA() {
		System.out.println("메소드A 실행");
	}

	public void methodB() {
		System.out.println("메소드B 실행");
	}

	public void methodC() {
		System.out.println("메소드C 실행");
	}
	
	public static void main(String[] args) {
		ImplementationC imple = new ImplementationC();
		
		InterfaceC ic = imple;
		
		ic.methodA();
		ic.methodB();
		ic.methodC();
	}

}
