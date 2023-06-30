package sec02;

public class ¹è¿­3 {
	

	public static void main(String[] args) {

		int[] scores;
		scores = new int[] { 83, 90, 87 };

		int sum1 = 0;

		for (int i = 0; i < scores.length; i++) {
			sum1 += scores[i];
		}

		System.out.printf("ÃÑÇÕ : %d\n", sum1);

		int sum2 = add(new int[] { 83, 90, 87 });
		System.err.printf("ÃÑÇÕ : %d\n\n", sum2);

	}

	public static int add(int[] scores) {
		int sum = 0;
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		return sum;
	}

}
