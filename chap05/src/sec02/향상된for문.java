package sec02;

public class ����for�� {

	public static void main(String[] args) {

		int[] scores = { 95, 71, 84, 93, 87 };

		int sum = 0;
		for (int i : scores) { // �迭 for��
			sum += i;
		}
		System.out.printf("���� ���� : %d\n", sum);

	}

}
