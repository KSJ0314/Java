package sec03;

public class �л����� {

	public static void main(String[] args) {

		Student student = new Student();
		System.out.printf("�̸� : %s\n���� : %d\n", student.name, student.age);

		System.out.println();

		Student student2 = new Student("ȫ����", 30);
		System.out.printf("�̸� : %s\n���� : %d\n", student2.name, student2.age);

		System.out.println();

		Student student3 = new Student("ȫ�浿", "20231111", "010-5555-7777");
		System.out.printf("�̸� : %s\n�й� : %s\n����ó : %s\n", student3.name, student3.studentNumber, student3.phoneNumber);

	}

}
