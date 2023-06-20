package sec02.exam04;

import java.util.Scanner;

public class 응용문제3 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("건물의 층 수를 입력하세요.");

		int floor = s.nextInt();
		int height = floor * 5;
		int maxPeople = height / 3;

		System.out.println("입력하신 건물은 전체 " + height + "m이고 최대거주인원은" + maxPeople + "명입니다");

	}

}
