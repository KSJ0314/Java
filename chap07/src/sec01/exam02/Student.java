package sec01.exam02;

public class Student extends People {
	public int studentCode;
	String studentDept; // ÇÐ°ú
	
	public Student(String name, String ssn, int studentCode) {
		super(name, ssn);
		this.studentCode = studentCode;
	}
	

}
