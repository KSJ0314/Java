package sec01;

public class studentExample {

	public static void main(String[] args) {

		Student student = new Student(65, 173, 1634003, "남자");

		student.awake(); // Human 메소드
		student.dressOn(); // Student 메소드
		System.out.println(student.eat("돈까스")); // Human 메소드
		System.out.println(student.superEat("돈까스")); // Human 메소드
		

	}

}
