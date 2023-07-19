package 상속연습문제.Q5;

public abstract class Calc {
	
	public int a;
	public int b;
	
	public void setValue(int num1, int num2){
		a = num1;
		b = num2;
	}
	public abstract int calculate();
	

}
