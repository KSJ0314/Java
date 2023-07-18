package 클래스연습문제;

import java.util.Scanner;
import java.util.StringTokenizer;

public class PhoneBook2 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		StringTokenizer st;

		System.out.print("인원수를 입력하세요 : ");
		int num = s.nextInt();
		Phone2[] phone = new Phone2[num];
		s.nextLine();

		for (int i = 0; i < num; i++) {
			System.out.print("이름과 전화번호(이름과 번호는 빈 칸 없이 입력) : ");
			st = new StringTokenizer(s.nextLine());
			phone[i] = new Phone2(st.nextToken(), st.nextToken());
		}
		System.out.println("저장되었습니다.");

		while (true) {
			System.out.print("검색할 이름 : ");
			String inputName = s.next();
			int i;
			if (inputName.equals("중지")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			for (i = 0; i < num; i++) {
				if (phone[i].name.equals(inputName)) {
					System.out.println(inputName+"의 전화번호는 " + phone[i].phoneNum + "입니다.");
				}
			}
			if (i == num) {
				System.out.println(inputName + "이 없습니다.");
			}
		}

	}

}
