public class Student extends User {
	private String department;
	private int studentNumber;

	public Student(String firstName, String lastName, String nationalNumber, int age, String department,
			int studentNumber) {
		super(firstName, lastName, nationalNumber, age);
		this.department = department;
		this.studentNumber = studentNumber;
	}

	public Student() {
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(int studentNumber) {
		this.studentNumber = studentNumber;
	}
}
