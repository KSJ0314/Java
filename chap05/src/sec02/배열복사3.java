package sec02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class �迭����3 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] name = new String[3];

		for (int i = 0; i < name.length; i++) {
			System.out.print("�л� �̸��� �Է����ּ���. ");
			name[i] = br.readLine();
		}

		String[] newName = new String[5];

		System.arraycopy(name, 0, newName, 0, name.length);

		for (int i = 0; i < newName.length; i++) {
			if (newName[i] == null) {
				newName[i] = "����";
			}
			System.out.print(newName[i]);
			if (i < newName.length - 1) {
				System.out.print(", ");
			} else {
				System.out.println();
			}
		}
	}

}
