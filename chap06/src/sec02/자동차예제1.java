package sec02;

public class �ڵ�������1 {

	public static void main(String[] args) {

		Car myCar = new Car();
		Car myCar2 = new Car();

		System.out.printf("ȸ�� �̸� : %s\n", myCar.company);
		System.out.printf("�𵨸� : %s\n", myCar.model);

		myCar.company = "���";
		myCar.model = "�ƺ�Ÿ����";

		System.out.printf("ȸ�� �̸� : %s\n", myCar.company);
		System.out.printf("�𵨸� : %s\n", myCar.model);

	}

}
