package sec01;

import java.io.IOException;

public class KeyboardToStringExmaple {

	public static void main(String[] args) throws IOException {

		byte[] by = new byte[100];

		System.out.println("�Է��ϼ��� : ");
		int rBN = System.in.read(by); // byte Number �Է�

		String str = new String(by, 0, rBN - 2);
		System.out.println(str);

	}

}
