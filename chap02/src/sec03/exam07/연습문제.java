package sec03.exam07;

import java.util.Scanner;

public class �������� {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("�׼��� �Է����ּ���.");

		int money = s.nextInt();

//		System.out.print("�������� " + (money / 50000) + "��, ");
//		money = money % 50000;
//		System.out.print("������ " + (money / 10000) + "��, ");
//		money = money % 10000;
//		System.out.print("��õ���� " + (money / 5000) + "��, ");
//		money = money % 5000;
//		System.out.print("õ���� " + (money / 1000) + "��, ");
//		money = money % 1000;
//		System.out.print("��������� " + (money / 500) + "��, ");
//		money = money % 500;
//		System.out.print("������� " + (money / 100) + "��, ");
//		money = money % 100;
//		System.out.print("���ʿ����� " + (money / 50) + "��, ");
//		money = money % 50;
//		System.out.print("�ʿ����� " + (money / 10) + "��, ");
//		money = money % 10;
//		System.out.println("�Ͽ����� " + money + "��");

		int[] moneys = { 50000, 10000, 5000, 1000, 500, 100, 50, 10 };
		for (int i = 0; i < moneys.length; i++) {
			if (money / moneys[i] != 0) {
				if (i<4) {
					System.out.print(moneys[i] + "���� " + (money / moneys[i]) + "��, ");
					money = money % moneys[i];
				} else {
					System.out.print(moneys[i] + "������ " + (money / moneys[i]) + "��, ");
					money = money % moneys[i];
				}
			} 
		}
		System.out.println("1������ " + money + "��");

	}

}
