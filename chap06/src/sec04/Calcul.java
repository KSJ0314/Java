package sec04;

public class Calcul {
	void powerOn() {
		System.out.println("전원을 켭니다.");
	}

	void powerOff() {
		System.out.println("전원을 끕니다.");
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
			return "0은 입력할 수 없습니다.";
		}
		return String.valueOf(x * y);
	}

	double div(int x, int y) {
		double result = (double) x / y;
		return result;
	}

}
