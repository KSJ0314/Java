package sec01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class switch����1 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("���� ������ �̸��� �����ΰ���? ");
		String name = br.readLine();
		System.out.print("������ ������ �� ���ΰ���? ");
		int point = Integer.parseInt(br.readLine());

		String grade;

		switch (point) {
			case 10:
			case 9:
			case 8:
				grade = "�ֻ��";
				break;
			case 7:
			case 6:
			case 5:
				grade = "�߱�";
				break;
			default:
				grade = "�ϱ�";
		}

		System.out.printf("%s���� ����� %s�Դϴ�.\n", name, grade);

	}

}
