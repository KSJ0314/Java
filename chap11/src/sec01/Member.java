package sec01;

public class Member {
	public String id;
	public String name;

	public Member(String id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return id + ": " + name;
	}

}
