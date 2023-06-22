package sec02;

import java.util.Scanner;

public class 계산기 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.print("첫번째 숫자를 입력해주세요 : ");
		int a = s.nextInt();

		System.out.print("두번째 숫자를 입력해주세요 : ");
		int b = s.nextInt();

		System.out.print("연산자를 입력해주세요(+,-,*,/) : ");
		String c = s.next();

		if (a < b) {
			int temp = a;
			a = b;
			b = temp;
		}
		
		int result1 = 0;
		float result2;

		if (c.equals("+")) {
			result1 = a + b;
		} else if (c.equals("-")) {
			result1 = a - b;
		} else if (c.equals("*")) {
			result1 = a * b;
		}
		
		if (c.equals("/")) {
			result2 = (float) a / b;
			System.out.println(result2);
		} else {
			System.out.println(result1);
		}


	}

}
