package sec01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class if����1 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("���� ������ �̸��� �����ΰ���? ");
		String name = br.readLine();
		System.out.print("������ ������ �� ���ΰ���? ");
		int point = Integer.parseInt(br.readLine());

		String grade;
		if (point >= 8) {
			grade = "�ֻ��";
		} else if (point >= 5) {
			grade = "�߱�";
		} else {
			grade = "�ϱ�";
		}
		
		System.out.printf("%s���� ����� %s�Դϴ�.\n", name, grade);

	}

}
