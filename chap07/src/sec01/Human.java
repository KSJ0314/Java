package sec01;

public class Human {
	int weight;	// ������
	int height; // Ű
	String gender;	// ����
	
	public Human(int weight, int height) {
		this.weight = weight;
		this.height = height;
	}
	void sleep() {System.out.println("���� ��ϴ�.");}
	void awake() {System.out.println("�Ͼ�ϴ�.");}
	
	String eat(String food) {
		return food + "(��)�� �Խ��ϴ�.";
	}
	
	String run(int speed) {
		return speed + "km/h�� �޸��ϴ�.";
	}
}
