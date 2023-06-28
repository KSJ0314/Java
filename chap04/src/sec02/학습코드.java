package sec02;

import java.util.Scanner;

public class 학습코드 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

//		System.out.print("학습코드를 입력하세요. ");
//		String code = s.next();
//
//		String year = code.substring(0, 2);
//		String sub;
//
//		switch (code.charAt(2)) {
//			case 'M':
//				sub = "수학";
//				break;
//			case 'K':
//				sub = "국어";
//				break;
//			case 'E':
//				sub = "영어";
//				break;
//			default:
//				sub = "?";
//		}
//
//		System.out.printf("20%s년도 %s과목 신청자입니다.", year, sub);

//		System.out.print("숫자를 입력하세요. ");
//		int num = s.nextInt();
//		int sum = 0;
//		for (int i = 1; i <= num; i++) {
//			sum += i;
//		}
//		System.out.printf("1부터 %d까지의 합계는 : %d입니다.", num, sum);

		System.out.print("정수 입력 1 : ");
		int num1 = s.nextInt();
		System.out.print("정수 입력 2 : ");
		int num2 = s.nextInt();

		if (num1 > num2) {
			int temp = num1;
			num1 = num2;
			num2 = temp;
		}

		int sum = 0;
		for (int i = num1; i < num2; i++) {
			System.out.printf("%d+", i);
			sum += i;
		}
		sum += num2;
		System.out.printf("%d=%d\n", num2, sum);

		sum = 0;
		for (int i = num1; i <= num2; i++) {
			sum += i;
			if (i == num2) {
				System.out.printf("%d=%d", i, sum);
			} else {
				System.out.printf("%d+", i);
			}
		}


	}

}
