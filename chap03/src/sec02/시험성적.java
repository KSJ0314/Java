package sec02;

import java.util.Scanner;

public class 시험성적 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

//		System.out.print("당신의 이름은? ");
//		String name = s.next();
//
//		System.out.print("접속 비밀번호를 입력해주세요. ");
//		String pass = s.next();
//		char a = pass.charAt(0);
//		char b = pass.charAt(1);
//
//		if (a >= 97 && a <= 122 && b >= 48 && b <= 57) {
//			System.out.println("환영합니다.");
//		} else {
//			System.out.println("비밀번호는 영어 소문자와 숫자의 조합입니다.");
//		}

		System.out.print("중간고사 성적을 입력해주세요. ");
		int mid = s.nextInt();

		System.out.print("기말고사 성적을 입력해주세요. ");
		int last = s.nextInt();

		if (mid >= 80 || last >= 80) {
			System.out.println("통과");
		} else {
			System.out.println("탈락");
		}

	}

}
