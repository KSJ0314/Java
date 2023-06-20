package sec01.exam01;

public class 변수값교환2 {

	public static void main(String[] args) {

		int a = 10, b = 20, c = 30;

		a = c - a;
		c = a + b + 10;
		b = c + a;

//		int temp_a = a, temp_b = b, temp_c = c;
//		a = temp_c - temp_a;
//		c = temp_a + temp_b + 10;
//		b = temp_c + temp_a;

		System.out.println("a:" + a + ", b:" + b + ", c:" + c);

	}

}
