package sec04;

import java.util.Scanner;

public class �������� {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		System.out.print("�̸��� �Է��ϼ���. : ");
		String name = s.next();
		
		System.out.print("���̸� �Է��ϼ���. : ");
		int age = s.nextInt();
		
		System.out.println("���� \t �̸�\t  ����");
		System.out.printf("%-3d\t%s\t%4d\n", 1, name, age);
		
		
	}

}
