package sec02;

import java.util.Scanner;

public class Ȯ�ι���11 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.print("������ �ڵ带 �Է��ϼ���: ");
		String code = s.next();
		String code_Id = code.substring(0, 3);
		int code_pass = Integer.parseInt(code.substring(3));

		System.out.print("���̵�: ");
		String name = s.next();
		System.out.print("�н�����: ");
		int pass = s.nextInt();
		
		if (code_Id.equals(name)) {
			if (code_pass == pass) {
				System.out.println("�α��� ����");
			} else {
				System.out.println("�α��� ����:�н����尡 Ʋ��");
			}
		} else {
			System.out.println("�α��� ����:���̵� �������� ����");
		}

	}

}
