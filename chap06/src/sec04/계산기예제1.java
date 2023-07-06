package sec04;

public class 계산기예제1 {

	public static void main(String[] args) {

		Calcul calcul = new Calcul();
		calcul.powerOn();
		System.out.println(calcul.plus(5, 3));
		System.out.println(calcul.minus(5, 3));
		System.out.println(calcul.minus(3, 5));
		System.out.println(calcul.mul(3, 5));
		System.out.println(calcul.mul(3, 0));
		System.out.println(calcul.div(5, 2));
		calcul.powerOff();

	}

}
