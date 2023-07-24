package sec01;

public class SystemExample {

	public static void main(String[] args) {

		for (int i = 1; i <= 100; i++) {
			if(i==50) {
				System.out.println("50이 나와서 중지했슴다.");
				System.exit(0);
			} else if(i%2==0) {
				System.out.println(i);
			}
		}
		
	}

}
