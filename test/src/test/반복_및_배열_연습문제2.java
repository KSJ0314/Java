package test;

import java.util.Scanner;

public class 반복_및_배열_연습문제2 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.print("정수를 입력하세요 : ");
		int num = s.nextInt();

		for (int i = 0; i < num; i++) {
			for(int j = i ; j < num; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
