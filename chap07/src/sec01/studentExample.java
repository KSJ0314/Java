package sec01;

public class studentExample {

	public static void main(String[] args) {

		Student student = new Student(65, 173, 1634003, "����");

		student.awake(); // Human �޼ҵ�
		student.dressOn(); // Student �޼ҵ�
		System.out.println(student.eat("���")); // Human �޼ҵ�
		System.out.println(student.superEat("���")); // Human �޼ҵ�
		

	}

}
