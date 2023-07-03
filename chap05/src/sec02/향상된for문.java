package sec02;

public class 향상된for문 {

	public static void main(String[] args) {

		int[] scores = { 95, 71, 84, 93, 87 };

		int sum = 0;
		for (int i : scores) { // 배열 for문
			sum += i;
		}
		System.out.printf("점수 총합 : %d\n", sum);

	}

}
