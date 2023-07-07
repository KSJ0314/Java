package sec04;

public class CalculaterExample {

	public static void main(String[] args) {
		
		Calculater calculater = new Calculater();
		calculater.println("°¡³ª´Ù");
		System.out.println(calculater.plus(6, 4));
		System.out.println(calculater.avg(10, 15));
		calculater.execute(6, 4);
		
	}
}
