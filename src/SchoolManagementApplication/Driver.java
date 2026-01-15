package SchoolManagementApplication;

public class Driver {
	public static void main(String[] args) {
		Student s=new Student("Shyantan",22,12,'A');
		Course c=new Course(45,"Computer Sc.");
		s.setC(c);
		StudentCourse sc = new StudentCourse(s);
		sc.printStudentCourse();
	}
}
