package sec03.exam03;

import java.util.Scanner;

public class 나누기곱하기 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		System.out.print("첫 번째 숫자를 입력하세요. : ");
		int a = s.nextInt();
		
		System.out.print("두 번째 숫자를 입력하세요. : ");
		int b = s.nextInt();
		
		System.out.print("연산기호를 입력하세요.(*,/) : ");
		String c = s.next();
		//char d = c.charAt(0);
		
		if (c.equals("*")) {
			int e = a*b;
			System.out.println("입력하신 연산의 결과는 " + e + "입니다.");
		} else {
			float e = (float)a/b;
			System.out.println("입력하신 연산의 결과는 " + e + "입니다.");
		}
		
	}

}
