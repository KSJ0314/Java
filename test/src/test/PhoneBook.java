package test;

import java.util.Scanner;
import java.util.StringTokenizer;

public class PhoneBook {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		StringTokenizer st;

		System.out.print("인원수를 입력하세요 : ");
		int num = s.nextInt();
		Phone phone = new Phone(num);
		s.nextLine();

		for (int i = 0; i < num; i++) {
			System.out.print("이름과 전화번호(이름과 번호는 빈 칸 없이 입력) : ");
			st = new StringTokenizer(s.nextLine());
			phone.name[i] = st.nextToken();
			phone.phoneNum[i] = st.nextToken();
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
				if (phone.name[i].equals(inputName)) {
					System.out.println(inputName+"의 전화번호는 " + phone.phoneNum[i] + "입니다.");
				}
			}
			if (i == num) {
				System.out.println(inputName + "이 없습니다.");
			}
		}

	}

}
