package 패키지문제;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("문자열을 입력하세요. 빈칸이 있어도되고 영어 한글 모두 됩니다.");

		String st = sc.nextLine();

		for (int j = 0; j < st.length(); j++) {
			char a = st.charAt(0);
			String b = st.substring(1);
			st = b + a;
			System.out.println(st);
		}

	}

}
