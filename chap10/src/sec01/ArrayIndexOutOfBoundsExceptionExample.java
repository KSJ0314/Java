package sec01;

public class ArrayIndexOutOfBoundsExceptionExample {

	public static void main(String[] args) {

		String[] arr = new String[10];
		String data1 = arr[0];
		
		System.out.println(data1);
		
		String data2 = args[0];
		System.out.println(data2);
		
	}

}
