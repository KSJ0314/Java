package sec01;

import java.util.Scanner;

public class IfDiceExample2 {

	public static void main(String[] args) {

		int num1 = (int) (Math.random() * 6) + 1;

		Scanner s = new Scanner(System.in);
		System.out.print("1~6사이의 숫자를 입력 해주세요. ");
		int num2 = s.nextInt();
		
		if (num1 > num2 ) {
			System.out.println("컴퓨터 숫자가 더 큽니다.");
		} else if (num1 < num2) {
			System.out.println("사용자 숫자가 더 큽니다.");
		} else {
			System.out.println("두 수가 일치합니다.");
		}
		
		System.out.printf("컴퓨터의 숫자는 %d입니다.", num1);
		

	}

}
