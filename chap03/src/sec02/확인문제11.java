package sec02;

import java.util.Scanner;

public class 확인문제11 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.print("관리자 코드를 입력하세요: ");
		String code = s.next();
		String code_Id = code.substring(0, 3);
		int code_pass = Integer.parseInt(code.substring(3));

		System.out.print("아이디: ");
		String name = s.next();
		System.out.print("패스워드: ");
		int pass = s.nextInt();
		
		if (code_Id.equals(name)) {
			if (code_pass == pass) {
				System.out.println("로그인 성공");
			} else {
				System.out.println("로그인 실패:패스워드가 틀림");
			}
		} else {
			System.out.println("로그인 실패:아이디 존재하지 않음");
		}

	}

}
