package sec01;

public class DmbCellPhoneExample {

	public static void main(String[] args) {

		DmbCellPhone dmbCellPhone = new DmbCellPhone("자바폰", "검정", 10);

		System.out.println(dmbCellPhone.model); // 상속받은 필드 출력
		System.out.println(dmbCellPhone.color); // 상속받은 필드 출력
		dmbCellPhone.turnOnDmb(); // 자기 메소드 출력
		dmbCellPhone.bell(); // 상속받은 메소드 출력
		
		
		
	}

}
