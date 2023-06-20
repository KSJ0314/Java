package sec04;

public class KeyCodeExample {

	public static void main(String[] args) throws Exception {

		int keyCode;
		
		while(true) {
			keyCode = System.in.read();
			System.out.println("keyCode : " + keyCode);
			if (keyCode == 113) {
				System.out.println("종료");
				System.out.println("종료");
				break;
			}
		}
		
		
		
	}

}
