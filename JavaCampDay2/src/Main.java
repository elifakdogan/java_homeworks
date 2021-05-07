public class Main {

	public static void main(String[] args) {

		Course course1 = new Course(1, "c#+Angular", "Engin Demiro�");
		Course course2 = new Course(2, "JAVA & React", "Engin Demiro�");
		Course course3 = new Course(3, "Programlamaya giri� i�in temel kurs", "Engin Demiro�");

		Course[] courses = { course1, course2, course3 };
		for (Course course : courses) {
			System.out.println(course.id);
			System.out.println("Kursun ad�: " + course.courseName);
			System.out.println("Kursun e�itmeni: " + course.teacherName);
		}
		
		System.out.println("----------------------------");
		
		CourseManager courseManager = new CourseManager();
		courseManager.addToCard(course1);
		courseManager.addToCard(course2);
		courseManager.addToCard(course3);
		courseManager.addToCard1(course1);
		courseManager.addToCard1(course2);
		courseManager.addToCard1(course3);
	}
}
