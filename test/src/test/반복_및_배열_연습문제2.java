package test;

import java.util.Scanner;

public class �ݺ�_��_�迭_��������2 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.print("������ �Է��ϼ��� : ");
		int num = s.nextInt();

		for (int i = 0; i < num; i++) {
			for(int j = i ; j < num; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
