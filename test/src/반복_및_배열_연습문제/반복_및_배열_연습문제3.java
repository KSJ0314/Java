package �ݺ�_��_�迭_��������;

import java.util.Scanner;
import java.util.StringTokenizer;

public class �ݺ�_��_�迭_��������3 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		StringTokenizer st;

		int[] arr = new int[10];
		System.out.print("������ 10�� �Է��ϼ��� : ");
		st = new StringTokenizer(s.nextLine());
		for (int i = 0; i < 10; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		System.out.print("\n¦���� : ");

		for (int i = 0; i < 10; i++) {
			if (arr[i] % 2 == 0) {
				System.out.print(arr[i] + " ");
			}
		}

	}

}
