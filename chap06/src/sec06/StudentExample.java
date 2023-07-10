package sec06;

import java.util.Scanner;

public class StudentExample {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		Student student = new Student();
		
		student.checkLogin();
		while(true) {
			
			System.out.println("작업을 선택해주세요. ");
			System.out.println("1.로그아웃 | 2.성적입력");
			int choice = s.nextInt();
			if (choice == 1) {
				System.out.println("종료합니다.");
				break;
			} else if (choice == 2) {
				student.inputExam();
				break;
			} else {
				System.out.println("잘못 입력했습니다.");
			}
		}
		

	}

}
