package sec04;

public class Calculater {

	int plus(int x, int y) { // �հ�
		int result = x + y;
		return result;
	}

	double avg(int x, int y) { // ���
		double sum = plus(x, y);
		double result = sum / 2;
		return result;
	}

	void execute(int x, int y) { // ���+���
		println("������ : " + avg(x, y));
	}

	void println(String message) { // ���
		System.out.println(message);
	}

}
