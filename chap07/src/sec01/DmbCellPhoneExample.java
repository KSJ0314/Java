package sec01;

public class DmbCellPhoneExample {

	public static void main(String[] args) {

		DmbCellPhone dmbCellPhone = new DmbCellPhone("�ڹ���", "����", 10);

		System.out.println(dmbCellPhone.model); // ��ӹ��� �ʵ� ���
		System.out.println(dmbCellPhone.color); // ��ӹ��� �ʵ� ���
		dmbCellPhone.turnOnDmb(); // �ڱ� �޼ҵ� ���
		dmbCellPhone.bell(); // ��ӹ��� �޼ҵ� ���
		
		
		
	}

}
