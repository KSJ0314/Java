package sec02.exam04;

import java.util.Scanner;

public class ���빮��3 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("�ǹ��� �� ���� �Է��ϼ���.");

		int floor = s.nextInt();
		int height = floor * 5;
		int maxPeople = height / 3;

		System.out.println("�Է��Ͻ� �ǹ��� ��ü " + height + "m�̰� �ִ�����ο���" + maxPeople + "���Դϴ�");

	}

}
