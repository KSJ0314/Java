package sec01;

import java.util.Scanner;

public class 조건문3 {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.print("사용자 코드를 입력해 주세요 ");
		String code = s.next();

		switch (code.charAt(0)) {
			case 'A':
			case 'a':
				System.out.println("인사부에 배정되셨습니다.");
				break;
			case 'B':
			case 'b':
				System.out.println("기획부에 배정되셨습니다.");
				break;
			case 'C':
			case 'c':
				System.out.println("총무부에 배정되셨습니다.");
				break;
			default:
				System.out.println("X");
		}

	}
}
