package SchoolManagementApplication;

public class StudentCourse {
	private Student s;
	StudentCourse(){
		
	}
	StudentCourse(Student s){
		setS(s);
	}
	public Student getS() {
		return s;
	}
	public void setS(Student s) {
		this.s = s;
	}
	
	public void printStudentCourse() {
		System.out.println("Student-name: "+s.getName()+", Age: "+s.getAge()+"\nRoll-no.: "+s.getRollno()+", Grade: "+s.getGrade()+"\nCourse-id: "+s.getC().getCourseid() +", Course-name: "+s.getC().getCoursename());
	}
}
