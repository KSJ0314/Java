package sec01;

public class ByteToStringExample {

	public static void main(String[] args) {

		byte[] by = { 71, 111, 111, 100, 32, 109, 111, 114, 110, 105, 110, 103 };
		String a = new String(by);
		String b = new String(by, 5, 7);
		String c = new String(new byte[] { 109, 111, 114, 110, 105, 110, 103 });

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

	}

}
