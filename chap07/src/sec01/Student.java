package sec01;

public class Student extends Human {
	int studentCode; // �й�
	String studentDept; // �а�

	public Student(int weight, int height, int studentCode, String gender) {
		super(weight, height);
		this.studentCode = studentCode;
		this.gender = gender;
	}

	void study(String place) {
		System.out.println(place + "���� �����մϴ�.");
	}

	void dressOn() {
		System.out.println("������ �Ծ��.");
	}

	void dressOff() {
		System.out.println("������ �����.");
	}

	@Override
	String eat(String food) {
		return food + "(��)�� ���ְ� �Խ��ϴ�.";
	}

	String superEat(String food) {
		return super.eat(food);
	}

}
