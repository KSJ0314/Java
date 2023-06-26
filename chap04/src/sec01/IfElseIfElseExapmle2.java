package sec01;

import java.util.Scanner;

public class IfElseIfElseExapmle2 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.print("중간고사 성적은?");
		int mid = s.nextInt();
		System.out.print("기말고사 성적은?");
		int last = s.nextInt();

		int avg = (mid + last) / 2;

		if (mid < 60 || last < 60) {
			System.out.println("재수강");
		} else if (avg >= 90) {
			System.out.println("A학점");
		} else if (avg >= 80) {
			System.out.println("B학점");
		} else {
			System.out.println("C학점");
		}

	}

}
