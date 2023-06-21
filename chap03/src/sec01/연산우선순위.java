package sec01;

import java.util.Scanner;

public class 연산우선순위 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.print("첫번째 숫자를 입력하세요. : ");
		int num1 = s.nextInt();

		System.out.print("두번째 숫자를 입력하세요. : ");
		int num2 = s.nextInt();

		int sum = num1 + num2;

//		String isPass = (sum >= 50) ? "통과" : "탈락";
//		System.out.println(isPass);

		System.out.println((sum >= 50) ? "통과" : "탈락");

	}

}
