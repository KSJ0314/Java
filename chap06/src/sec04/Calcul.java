package sec04;

public class Calcul {
	void powerOn() {
		System.out.println("������ �մϴ�.");
	}

	void powerOff() {
		System.out.println("������ ���ϴ�.");
	}

	int plus(int x, int y) {
		int result = x + y;
		return result;
	}

	int minus(int x, int y) {
		int result = Math.abs(x - y);
		return result;
	}

	String mul(int x, int y) {
		if (x == 0 || y == 0) {
			return "0�� �Է��� �� �����ϴ�.";
		}
		return String.valueOf(x * y);
	}

	double div(int x, int y) {
		double result = (double) x / y;
		return result;
	}

}
