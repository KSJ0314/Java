package sec02.exam05;

public class PhoneExample {

	public static void main(String[] args) {

		Phone p = new SmartPhone();

		System.out.println(p.cost);
		p.powerOn();
		p.ring();
		p.color = "����";
		p.cost = 50;

		SmartPhone sp = (SmartPhone) p;
		System.out.println(sp.color);
		System.out.println(sp.cost);

		Phone p2 = new Phone();
		if (p2 instanceof SmartPhone) {
			SmartPhone sp2 = (SmartPhone) p2;
			System.out.println("��ȯ ����");
		} else {
			System.out.println("��ȯ ����");
		}

	}

}
