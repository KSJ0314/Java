package sec02.exam05;

public class SmartPhone extends Phone {

	boolean touch;
	String camera;
	String phonecase;
	String film;
	int cost = 500000;
	
	@Override
	void ring() {
		System.out.println("����Ʈ���� �︳�ϴ�.");
	}
	
	void videoOn() {
		System.out.println("�������� �Կ��մϴ�.");
	}

}
