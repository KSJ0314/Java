package sec02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class �迭5 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] weather = new String[4];

		weather[0] = "��";
		weather[1] = "����";
		weather[2] = "����";
		weather[3] = "�ܿ�";

		System.out.println("�����ϴ� ������ �Է��ϼ���. ");
		a: while (true) {
			System.out.println("1.�� | 2.���� | 3.���� | 4.�ܿ�");
			int N = Integer.parseInt(br.readLine());
			
			if (N>=1 && N<=4) {
				System.out.printf("\"%s\"�� �����ϼ̽��ϴ�.", weather[N - 1]);
				break;
			}
			
//			switch (N) {
//			case 1:
//			case 2:
//			case 3:
//			case 4:
//				System.out.printf("\"%s\"�� �����ϼ̽��ϴ�.", weather[N - 1]);
//				break a;
//			}
			
			System.out.println("�ٽ� �����ϼ���.");
		}

	}

}
