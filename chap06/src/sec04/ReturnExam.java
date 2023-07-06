package sec04;

public class ReturnExam {

	static int plus(int x, int y) {
		int result = x + y;
		return result;
	}

	static int plus2(int x, int y) {
		byte result = (byte) (x + y);
		return result;
	}

	public static void main(String[] args) {
		
		ReturnExam returnExam = new ReturnExam();
		
		System.out.println(returnExam.plus(100, 200));
		System.out.println(returnExam.plus2(100, 200));

		System.out.println(plus(100, 200));
		System.out.println(plus2(100, 200));

	}

}
