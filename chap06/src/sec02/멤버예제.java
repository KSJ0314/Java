package sec02;

public class 멤버예제 {

	public static void main(String[] args) {

		Member member = new Member();
		member.name = "최하얀";
		member.age = 23;
		System.out.printf("이름 : %s\n나이 : %d\n", member.name, member.age);

	}

}
