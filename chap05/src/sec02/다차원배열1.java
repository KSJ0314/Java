package sec02;

public class 다차원배열1 {

	public static void main(String[] args) {

		int[][] mathScores = new int[2][3];

		for (int i = 0; i < mathScores.length; i++) {
			for (int j = 0; j < mathScores[i].length; j++) {
				System.out.printf("mathScores[%d][%d]=%d\n", i, j, mathScores[i][j]);
			}
		}
		System.out.println();

		int[][] englishScores = new int[2][];
		englishScores[0] = new int[2];
		englishScores[1] = new int[3];

		for (int i = 0; i < englishScores.length; i++) {
			for (int j = 0; j < englishScores[i].length; j++) {
				System.out.printf("mathScores[%d][%d]=%d\n", i, j, englishScores[i][j]);
			}
		}
		System.out.println();
		
		int[][] koreanScores = new int[4][];
		englishScores[0] = new int[2];
		englishScores[1] = new int[3];
		englishScores[2] = new int[1];
		englishScores[3] = new int[4];
		
		for (int i = 0; i < koreanScores.length; i++) {
			for (int j = 0; j < koreanScores[i].length; j++) {
				System.out.printf("mathScores[%d][%d]=%d\n", i, j, koreanScores[i][j]);
			}
		}
		System.out.println();

//		int[][] javaScores = { { 95, 80 }, { 92, 96, 80 } };
//
//		for (int i = 0; i < javaScores.length; i++) {
//			for (int j = 0; j < javaScores[i].length; j++) {
//				System.out.printf("mathScores[%d][%d]=%d\n", i, j, javaScores[i][j]);
//			}
//		}
//		System.out.println();

	}

}
