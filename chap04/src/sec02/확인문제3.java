package sec02;

public class 확인문제3 {

	public static void main(String[] args) {

		while (true) {
			int a = (int) (Math.random() * 6) + 1;
			int b = (int) (Math.random() * 6) + 1;

			System.out.printf("(%d, %d)\n", a, b);
			if (a + b == 5) {
				break;
			}
		}

	}

}
