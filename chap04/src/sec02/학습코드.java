package sec02;

import java.util.Scanner;

public class �н��ڵ� {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

//		System.out.print("�н��ڵ带 �Է��ϼ���. ");
//		String code = s.next();
//
//		String year = code.substring(0, 2);
//		String sub;
//
//		switch (code.charAt(2)) {
//			case 'M':
//				sub = "����";
//				break;
//			case 'K':
//				sub = "����";
//				break;
//			case 'E':
//				sub = "����";
//				break;
//			default:
//				sub = "?";
//		}
//
//		System.out.printf("20%s�⵵ %s���� ��û���Դϴ�.", year, sub);

//		System.out.print("���ڸ� �Է��ϼ���. ");
//		int num = s.nextInt();
//		int sum = 0;
//		for (int i = 1; i <= num; i++) {
//			sum += i;
//		}
//		System.out.printf("1���� %d������ �հ�� : %d�Դϴ�.", num, sum);

		System.out.print("���� �Է� 1 : ");
		int num1 = s.nextInt();
		System.out.print("���� �Է� 2 : ");
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
