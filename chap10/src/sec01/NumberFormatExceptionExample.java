package sec01;

public class NumberFormatExceptionExample {

	public static void main(String[] args) {

		String data1 = "100";
		int num1 = Integer.parseInt(data1);
		System.out.println(num1);
		
		String data2 = "a100";
		int num2 = Integer.parseInt(data2);
		System.out.println(num2);
		
		
	}

}
