package sec06;

import java.util.Scanner;

public class StudentExample {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		Student student = new Student();
		
		student.checkLogin();
		while(true) {
			
			System.out.println("�۾��� �������ּ���. ");
			System.out.println("1.�α׾ƿ� | 2.�����Է�");
			int choice = s.nextInt();
			if (choice == 1) {
				System.out.println("�����մϴ�.");
				break;
			} else if (choice == 2) {
				student.inputExam();
				break;
			} else {
				System.out.println("�߸� �Է��߽��ϴ�.");
			}
		}
		

	}

}
