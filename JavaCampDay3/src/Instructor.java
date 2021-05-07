public class Instructor extends User {
	private String job;
	private double salary;

	public Instructor(String firstName, String lastName, String nationalNumber, int age, String job, double salary) {
		super(firstName, lastName, nationalNumber, age);
		this.job = job;
		this.salary = salary;
	}

	public Instructor() {
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
}
