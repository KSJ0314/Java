package sec01;

public class OutterExample {

	public static void main(String[] args) {
		Outter ou = new Outter();
		Outter.Nested ne = new Outter().new Nested();
		
		ou.print();
		ne.print();

	}

}
