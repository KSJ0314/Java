package sec02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class �α��ι��� {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String id = "abc";
		int pass = 1234;

		while (true) {
			System.out.print("���̵� �Է����ּ���. ");
			String uid = br.readLine();
			System.out.print("��й�ȣ�� �Է����ּ���. ");
			int upass = Integer.parseInt(br.readLine());

			System.out.println("\n----------------------");
			if (!id.equals(uid)) {
				System.out.println(" ���̵� �������� �ʽ��ϴ�.");
			} else if (pass != upass) {
				System.out.println("     ��й�ȣ�� �޶��.");
			} else {
				System.out.println("       ȯ���մϴ�.");
				System.out.println("----------------------");
				break;
			}
			System.out.println("----------------------\n");
		}

	}

}
