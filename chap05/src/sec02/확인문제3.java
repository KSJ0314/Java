package sec02;

public class 확인문제3 {

	public static void main(String[] args) {

//		int[][] array = { { 95, 86 }, { 83, 92, 96 }, { 78, 87, 93, 87, 88 } };
//
//		for (int i = 0; i < array.length; i++) {
//			System.out.println(array[i].length);
//		}

		int max = 0;
		int[] array = { 1, 5, 3, 8, 2 };

		for (int i : array) {
			if (max < i) {
				max = i;
			}
		}
		System.out.printf("max: %d\n", max);

	}

}
