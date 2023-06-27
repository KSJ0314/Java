package sec01;

import java.util.Scanner;

public class 조건문4 {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.print("직원 코드를 입력해 주세요 ");
		String code = s.next();

		char part = code.charAt(0);
		String position = code.substring(1, 3);

		String a;
		switch (part) {
			case 'A':
			case 'a':
				a = "인사부";
				break;
			case 'B':
			case 'b':
				a = "기획부";
				break;
			default:
				a = "총무부";
		}
		
		String money;
		switch (position) {
			case "부장":
				money = "1,000,000";
				break;
			case "과장":
				money = "700,000";
				break;
			case "차장":
				money = "500,000";
				break;
			default:
				money = "0";
		}

		System.out.printf("%s %s님 보너스금액은 %s원입니다.", a, position, money);

	}
}
