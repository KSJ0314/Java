package sec01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class if����2 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("���� ������ �̸��� �����ΰ���? ");
		String name = br.readLine();

		char last;
		
//		if (name.length() == 3) {
//			last = name.charAt(2);
//		} else {
//			last = name.charAt(1);
//		}

//		last = (name.length() == 3) ? name.charAt(2) : name.charAt(1);

		last = name.charAt(name.length() - 1);

		System.out.printf("%s���� ���������ڴ� %c�Դϴ�.\n", name, last);

	}

}
