public class User {
	private String firstName;
	private String lastName;
	private String nationalNumber;
	int age;

	public User(String firstName, String lastName, String nationalNumber, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.nationalNumber = nationalNumber;
		this.age = age;
	}

	public User() {
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getNationalNumber() {
		return nationalNumber;
	}

	public void setNationalNumber(String nationalNumber) {
		this.nationalNumber = nationalNumber;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
