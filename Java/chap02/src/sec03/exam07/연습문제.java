package sec03.exam07;

import java.util.Scanner;

public class 연습문제 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("액수를 입력해주세요.");

		int money = s.nextInt();

		System.out.print("오만원권 " + (money / 50000) + "장, ");
		money = money % 50000;
		System.out.print("만원권 " + (money / 10000) + "장, ");
		money = money % 10000;
		System.out.print("오천원권 " + (money / 5000) + "장, ");
		money = money % 5000;
		System.out.print("천원권 " + (money / 1000) + "장, ");
		money = money % 1000;
		System.out.print("오백원동전 " + (money / 500) + "개, ");
		money = money % 500;
		System.out.print("백원동전 " + (money / 100) + "개, ");
		money = money % 100;
		System.out.print("오십원동전 " + (money / 50) + "개, ");
		money = money % 50;
		System.out.print("십원동전 " + (money / 10) + "개, ");
		money = money % 10;
		System.out.println("일원동전 " + money + "개");

	}

}
