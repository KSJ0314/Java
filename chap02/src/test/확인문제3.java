package test;

import java.util.Scanner;

public class 확인문제3 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("[필수 정보 입력]");
		
		System.out.print("1. 이름: ");
		String name = s.next();
		System.out.print("2. 주민번호 앞 6자리: ");
		String userNum = s.next();
		System.out.print("3. 전화번호: ");
		String tel = s.next();
		
		System.out.printf("\n[입력한 내용]\n%s\n%s\n%s", name, userNum, tel);
		// System.out.printf("%s님 주민번호는 %s이고 연락처는 %s입니다.", name, userNum, tel);
		
	}

}
