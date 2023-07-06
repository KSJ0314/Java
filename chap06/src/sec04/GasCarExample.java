package sec04;

public class GasCarExample {

	public static void main(String[] args) throws InterruptedException {

		GasCar gasCar = new GasCar();
		
		gasCar.setGas(5);
		
		boolean gasState = gasCar.isLeftGase();
		if (gasState) {
			System.out.println("출발합니다.");
			gasCar.run();
		}
		
		if (gasCar.isLeftGase()) {
			System.out.println("가스를 주입할 필요가 없습니다.");
		} else {
			System.out.println("가스를 주입하세요.");
		}
		
	}

}
