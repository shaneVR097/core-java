package SchoolManagementApplication;

public class StudentCourse {
	private Student s;
	public Student getS() {
		return s;
	}
	public void setS(Student s) {
		this.s = s;
	}
	public Course getC() {
		return c;
	}
	public void setC(Course c) {
		this.c = c;
	}
	private Course c;
	StudentCourse(){
		
	}
	StudentCourse(Student s,Course c){
		setS(s);
		setC(c);
	}
	public void printStudentCourse() {
		System.out.println(s.getName()+" "+s.getAge()+" "+s.getRollno()+" "+s.getGrade()+" "+c.getCourseid()+" "+c.getCoursename());
	}
}
