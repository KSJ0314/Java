package sec01;

import java.util.Scanner;

public class if����5 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.print("���� : ");
		int kor = s.nextInt();

		System.out.print("���� : ");
		int math = s.nextInt();

		System.out.print("���� : ");
		int eng = s.nextInt();

		int sum = kor + math + eng;

		if (kor > 6 && math > 6 && eng > 6 && sum >= 30) {
			System.out.println("�հ��Դϴ�.");
		} else {
			System.out.println("���հ��Դϴ�.");
		}

		if (kor <= 6 || math <= 6 || eng <= 6) {
			System.out.println("���հ��Դϴ�.");
			if (sum >= 30) {
				System.out.println("�հ��Դϴ�.");
			}
		}

	}

}
