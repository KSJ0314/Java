package sec01;

public class Computer extends Calculator {
	String name = "Computer";

	@Override
	double araCircle(double r) {
		System.out.println(name+ "�� araCircle() ����");
		return Math.PI * r * r;
	}

	
}
