package ��Ű������;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("���ڿ��� �Է��ϼ���. ��ĭ�� �־�ǰ� ���� �ѱ� ��� �˴ϴ�.");

		String st = sc.nextLine();

		char[] stArr = new char[st.length()];
		
		for (int i = 0; i < st.length(); i++) {
			stArr[i] = st.charAt(i);
		}
		
		for (int j = 0; j < stArr.length; j++) {
			char temp = stArr[0];
			for (int i = 0; i < stArr.length-1; i++) {
				stArr[i] = stArr[i+1];
			}
			stArr[stArr.length-1] = temp;
			System.out.println(stArr);
			
		}

	}

}
