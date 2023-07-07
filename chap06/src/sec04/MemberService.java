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
			System.out.println("로그아웃 되었습니다.");
		} else {
			System.out.println("id가 올바르지 않습니다.");
		}
	}

}
