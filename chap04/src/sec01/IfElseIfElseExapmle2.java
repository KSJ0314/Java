package sec01;

import java.util.Scanner;

public class IfElseIfElseExapmle2 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.print("�߰���� ������?");
		int mid = s.nextInt();
		System.out.print("�⸻��� ������?");
		int last = s.nextInt();

		int avg = (mid + last) / 2;

		if (mid < 60 || last < 60) {
			System.out.println("�����");
		} else if (avg >= 90) {
			System.out.println("A����");
		} else if (avg >= 80) {
			System.out.println("B����");
		} else {
			System.out.println("C����");
		}

	}

}
