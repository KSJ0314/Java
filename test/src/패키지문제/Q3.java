package ��Ű������;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("���ڿ��� �Է��ϼ���. ��ĭ�� �־�ǰ� ���� �ѱ� ��� �˴ϴ�.");

		String st = sc.nextLine();

		for (int j = 0; j < st.length(); j++) {
			char a = st.charAt(0);
			String b = st.substring(1);
			st = b + a;
			System.out.println(st);
		}

	}

}
