package sec01;

import java.util.Scanner;

public class IfDiceExample2 {

	public static void main(String[] args) {

		int num1 = (int) (Math.random() * 6) + 1;

		Scanner s = new Scanner(System.in);
		System.out.print("1~6������ ���ڸ� �Է� ���ּ���. ");
		int num2 = s.nextInt();
		
		if (num1 > num2 ) {
			System.out.println("��ǻ�� ���ڰ� �� Ů�ϴ�.");
		} else if (num1 < num2) {
			System.out.println("����� ���ڰ� �� Ů�ϴ�.");
		} else {
			System.out.println("�� ���� ��ġ�մϴ�.");
		}
		
		System.out.printf("��ǻ���� ���ڴ� %d�Դϴ�.", num1);
		

	}

}
