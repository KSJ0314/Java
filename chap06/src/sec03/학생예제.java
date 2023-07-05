package sec03;

public class 학생예제 {

	public static void main(String[] args) {

		Student student = new Student();
		System.out.printf("이름 : %s\n나이 : %d\n", student.name, student.age);

		System.out.println();

		Student student2 = new Student("홍수아", 30);
		System.out.printf("이름 : %s\n나이 : %d\n", student2.name, student2.age);

		System.out.println();

		Student student3 = new Student("홍길동", "20231111", "010-5555-7777");
		System.out.printf("이름 : %s\n학번 : %s\n연락처 : %s\n", student3.name, student3.studentNumber, student3.phoneNumber);

	}

}
