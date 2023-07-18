package 상속연습문제.Q2;

public class example {

	public static void main(String[] args) {

		Won2Dollar toDollar = new Won2Dollar(1200);
		toDollar.run();
		
		System.out.println();
		
		Km2Mile toMile = new Km2Mile(1.6);
		toMile.run();
	}

}
