package sec02;

public class ImplementationC implements InterfaceC {

	public void methodA() {
		System.out.println("�޼ҵ�A ����");
	}

	public void methodB() {
		System.out.println("�޼ҵ�B ����");
	}

	public void methodC() {
		System.out.println("�޼ҵ�C ����");
	}
	
	public static void main(String[] args) {
		ImplementationC imple = new ImplementationC();
		
		InterfaceC ic = imple;
		
		ic.methodA();
		ic.methodB();
		ic.methodC();
	}

}
