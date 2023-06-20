package sec03.exam07;

import java.util.Scanner;

public class 문자를기본타입으로변환 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.print("첫 번째 수를 입력해주세요. : ");
		String a = s.next();

		System.out.print("두 번째 수를 입력해주세요. : ");
		String b = s.next();

		int c = Integer.parseInt(a) + Integer.parseInt(b);

		System.out.println("두 수의 합은 " + c + "입니다.");

	}

}
