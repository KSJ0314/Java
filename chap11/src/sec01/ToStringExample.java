package sec01;

import java.util.Date;

public class ToStringExample {

	public static void main(String[] args) {

		Object obj1 = new Object();
		Date obj2 = new Date();

		System.out.println(obj1.toString());
		System.out.println(obj2.toString());

		SmartPhone obj3 = new SmartPhone("�Ｚ", "�ȵ���̵�");

		System.out.println(obj3.toString());
		System.out.println(obj3);
		
		iPhone iphone = new iPhone("����", 1500000, "iPhone14Max");
		System.out.println(iphone);

	}

}
