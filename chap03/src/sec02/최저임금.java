package sec02;

import java.util.Scanner;

public class 최저임금 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.print("근로시간을 입력해주세요 : ");
		int time = s.nextInt();
		int money = (int) ((time >= 10) ? 9620 * 1.2 * time : 9620 * time);
		System.out.printf("총 임금은 %d원 입니다.", money);

	}

}
