package ��ӿ�������.Q5;

public class Add extends Calc {

	@Override
	public void setValue(int num1, int num2) {
		a = num1;
		b = num2;
	}

	@Override
	public int calculate() {
		return a+b;
	}

}
