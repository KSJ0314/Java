package sec02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class while����3 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int ran = (int) (Math.random() * 20) + 1;

		while (true) {
			System.out.print("���� �ϳ��� �Է��ϼ���.(1~20) : ");
			int userNum = Integer.parseInt(br.readLine());
			if (userNum == ran) {
				System.out.println("�����Դϴ�.");
				break;
			} else if (userNum > ran) {
				System.out.println("Down");
			} else {
				System.out.println("Up");
			}
			System.out.println();
			
		}
	}

}
