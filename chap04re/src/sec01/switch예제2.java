package sec01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class switch����2 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("�а��ڵ带 �Է����ּ���. ");
		String code = br.readLine();

		String dept = "?";

		switch (code.charAt(0)) {
			case 'a':
			case 'A':
				dept = "����";
				break;
			case 'b':
			case 'B':
				dept = "�濵��";
				break;
			case 'c':
			case 'C':
				dept = "������";
				break;
		}

		System.out.printf("%s�� �л��Դϴ�.\n", dept);

	}

}
