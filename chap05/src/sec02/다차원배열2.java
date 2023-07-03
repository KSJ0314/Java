package sec02;

public class 다차원배열2 {

	public static void main(String[] args) {

		int[][] koreanScores = new int[4][3];
		koreanScores[0] = new int[2];
		koreanScores[2] = new int[1];

		for (int i = 0; i < koreanScores.length; i++) {
			for (int j = 0; j < koreanScores[i].length; j++) {
				System.out.printf("koreanScores[%d][%d]=%d\n", i, j, koreanScores[i][j]);
			}
		}
		System.out.println();

		int[][] koreanScores2 = { { 85, 93 }, { 72, 91, 88 }, { 66 }, { 55, 57, 59 } };

		for (int i = 0; i < koreanScores2.length; i++) {
			for (int j = 0; j < koreanScores2[i].length; j++) {
				System.out.printf("koreanScores2[%d][%d]=%d\n", i, j, koreanScores2[i][j]);
			}
		}
		System.out.println();
		
	}

}
