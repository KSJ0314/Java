package sec02;

public class SynchronizedExample {

	public static void main(String[] args) {
		
		ATM atm = new ATM();
		
		Thread tr1 = new Thread(atm, "����");
		Thread tr2 = new Thread(atm, "�Ƶ�");
		
		tr1.start();
		tr2.start();
		
	}

}
