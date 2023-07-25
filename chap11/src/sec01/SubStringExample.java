package sec01;

import java.util.Scanner;

public class SubStringExample {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("¿Ã∏ﬁ¿œ? ");
		String email = sc.next();

		String id = email.substring(0, email.indexOf("@"));
		String domain = email.substring(email.indexOf("@")+1);
		
		System.out.println(id);
		System.out.println(domain);

	}

}
