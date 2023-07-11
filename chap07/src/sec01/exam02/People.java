package sec01.exam02;

public class People {
	public String name;
	private String ssn;
	
	public People(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
	}

	public String getSsn() {
		return ssn;
	}
	
}
