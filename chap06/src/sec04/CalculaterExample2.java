package sec04;

public class CalculaterExample2 {

	public static void main(String[] args) {

		Calculater2 calculater2 = new Calculater2();

		double result1 = calculater2.areaRectangle(3.5);
		double result2 = calculater2.areaRectangle(3.5, 7);

		System.out.printf("���簢���� ���� : %.2f\n���簢�� ���� : %.2f\n", result1, result2);

	}
}
