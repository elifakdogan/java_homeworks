public class Main {

	public static void main(String[] args) {

		Student student = new Student();
		student.setFirstName("Elif");
		student.setLastName("Akdoğan");
		student.setAge(21);
		student.setDepartment("Computer Enginering");
		student.setNationalNumber("12345678910");
		student.setStudentNumber(123);

		Instructor instructor = new Instructor();
		instructor.setFirstName("Engin");
		instructor.setLastName("Demiroğ");
		instructor.setAge(35);
		instructor.setJob("Developer");
		instructor.setNationalNumber("1234567809");
		instructor.setSalary(9999);

		UserManager userManager = new UserManager();
		StudentManager studentManager = new StudentManager();
		InstructorManager instructorManager = new InstructorManager();

		studentManager.aboutStudent(student);
		instructorManager.aboutInstructor(instructor);
		userManager.user1(student);

	}

}
