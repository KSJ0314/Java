package sec04;

public class MemberService {

	private String id = "hong";
	private String pass = "12345";

	boolean login(String id, String pass) {
		if (id.equals(this.id) && pass.equals(this.pass)) {
			return true;
		} else {
			return false;
		}
	}

	void logout(String id) {
		if (id.equals(this.id)) {
			System.out.println("�α׾ƿ� �Ǿ����ϴ�.");
		} else {
			System.out.println("id�� �ùٸ��� �ʽ��ϴ�.");
		}
	}

}
