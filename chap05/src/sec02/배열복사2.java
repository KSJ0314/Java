package sec02;

public class �迭����2 {

	public static void main(String[] args) {

		int[] oldIntArray = { 1, 2, 3 };
		int[] newIntArray = new int[5];

		System.arraycopy(oldIntArray, 0, newIntArray, 0, oldIntArray.length);

		for (int i = 0; i < newIntArray.length - 1; i++) {
			System.out.printf("%d, ", newIntArray[i]);
		}
		System.out.printf("%d\n", newIntArray[newIntArray.length - 1]);

	}

}
