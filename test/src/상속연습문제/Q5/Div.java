package 상속연습문제.Q5;

public class Div extends Calc {

	@Override
	public void setValue(int num1, int num2) {
		a = num1;
		b = num2;
	}

	@Override
	public int calculate() {
		return a/b;
	}

}
