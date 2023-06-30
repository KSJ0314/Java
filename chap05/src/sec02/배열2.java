package sec02;

public class ¹è¿­2 {

	public static void main(String[] args) {

		int d[] = { 52, 87, 94, 77, 69 };

		int sum = 0;
		for (int i = 0; i < d.length; i++) {
			sum += d[i];
		}
		double avg = (double) sum / d.length;

		System.out.printf("ÃÑÇÕ : %d\n", sum);
		System.out.printf("Æò±Õ : %.2f\n", avg);

		int[] t = null;

		t = new int[] { 1, 2, 3 };
		t = new int[] { 1, 2, 3, 4, 5 };
		t[0] = 5;

		for (int i = 0; i < t.length; i++) {
			System.out.printf("t[%d] : %d\n", i, t[i]);
		}

	}

}
