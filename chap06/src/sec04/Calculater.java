package sec04;

public class Calculater {

	int plus(int x, int y) { // 합계
		int result = x + y;
		return result;
	}

	double avg(int x, int y) { // 평균
		double sum = plus(x, y);
		double result = sum / 2;
		return result;
	}

	void execute(int x, int y) { // 평균+출력
		println("실행결과 : " + avg(x, y));
	}

	void println(String message) { // 출력
		System.out.println(message);
	}

}
