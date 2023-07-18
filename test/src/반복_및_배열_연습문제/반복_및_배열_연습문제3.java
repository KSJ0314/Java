package 반복_및_배열_연습문제;

import java.util.Scanner;
import java.util.StringTokenizer;

public class 반복_및_배열_연습문제3 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		StringTokenizer st;

		int[] arr = new int[10];
		System.out.print("정수를 10개 입력하세요 : ");
		st = new StringTokenizer(s.nextLine());
		for (int i = 0; i < 10; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		System.out.print("\n짝수는 : ");

		for (int i = 0; i < 10; i++) {
			if (arr[i] % 2 == 0) {
				System.out.print(arr[i] + " ");
			}
		}

	}

}
