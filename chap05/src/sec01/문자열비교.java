package sec01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ���ڿ��� {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String strVar1 = "ȫ�浿";
		String strVar2 = "ȫ�浿";

		if (strVar1 == strVar2) {
			System.out.println("�� �������� ������ ���ƿ�");
		} else {
			System.out.println("�� �������� ������ �޶��");
		}

		String c = new String("ȫ�浿");
		String d ="ȫ�浿";

		if (c == d) {
			System.out.println("�� �������� ������ ���ƿ�");
		} else {
			System.out.println("�� �������� ������ �޶��");
		}

		String a = br.readLine();
		String b = br.readLine();

		if (a == b) {
			System.out.println("�� �������� ������ ���ƿ�");
		} else {
			System.out.println("�� �������� ������ �޶��");
		}

	}

}
