package sec02;

public class Tire {

	public int maxRotation; // �ִ� ȸ����
	public int accumulatedRotation; // ���� ȸ����
	public String location; // Ÿ�̾� ��ġ

	// �Ű����� 2�� ������
	public Tire(int maxRotation, String location) {
		this.maxRotation = maxRotation;
		this.location = location;
	}

	public boolean roll() {
		accumulatedRotation++;
		if (accumulatedRotation < maxRotation) {
			System.out.println(location + " Tire ���� : " + (maxRotation - accumulatedRotation) + "ȸ");
			return true;
		} else {
			System.out.println("*** " + location + " Tire ��ũ ***");
			return false;
		}
	}

}
