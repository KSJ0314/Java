package sec04;

public class GasCarExample {

	public static void main(String[] args) throws InterruptedException {

		GasCar gasCar = new GasCar();
		
		gasCar.setGas(5);
		
		boolean gasState = gasCar.isLeftGase();
		if (gasState) {
			System.out.println("����մϴ�.");
			gasCar.run();
		}
		
		if (gasCar.isLeftGase()) {
			System.out.println("������ ������ �ʿ䰡 �����ϴ�.");
		} else {
			System.out.println("������ �����ϼ���.");
		}
		
	}

}
