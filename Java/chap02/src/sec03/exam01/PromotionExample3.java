package sec03.exam01;

import java.util.Scanner;

public class PromotionExample3 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.print("출신학교를 입력하세요 : ");
		String a = s.next();
		char b = a.charAt(2);

		System.out.print("현재 몇학년 인가요? : ");
		int c = s.nextInt();

		if (b == '중') {
			System.out.print("당신은 중학교 ");
		} else {
			System.out.print("당신은 고등학교 ");
		}
		System.out.println(c + "학년입니다.");

	}

}
