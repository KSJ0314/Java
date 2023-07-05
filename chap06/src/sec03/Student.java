package sec03;

public class Student {
	String name; // 이름
	int age; // 나이
	String studentNumber; // 학번
	String gender; // 성별
	String phoneNumber; // 연락처

	public Student() {
	}

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public Student(String name, String studentNumber, String phoneNumber) {
		this.name = name;
		this.studentNumber = studentNumber;
		this.phoneNumber = phoneNumber;
	}

	public Student(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
}
