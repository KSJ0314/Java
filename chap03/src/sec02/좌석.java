package sec02;

import java.util.Scanner;

public class �¼� {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.print("�л� ���� �Է����ּ��� : ");
		int student = s.nextInt();
		System.out.print("�� �ٿ� ��� �ɳ���? : ");
		int line = s.nextInt();

		int a = student / line;
		int b = student % line;

//		int result = (b == 0) ? a : a + 1;
//		int result2 = (b == 0) ? b : line - b;
//		System.out.printf("�� %d���̰� ���� �¼����� %d�� �Դϴ�.\n", result, result2);

		if (b != 0) {
			a++;
			b = line - b;
		}		
		System.out.printf("�� %d���̰� ���� �¼����� %d�� �Դϴ�.\n", a, b);
	}

}
