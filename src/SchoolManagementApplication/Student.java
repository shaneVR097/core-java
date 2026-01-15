package SchoolManagementApplication;

public class Student extends Person {
	private int rollno;
	private char grade;
	
	Student(){
		
	}
	
	Student(String name,int age,int rollno,char grade){
		setName(name);
		setAge(age);
		setRollno(rollno);
		setGrade(grade);
	}
	
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public char getGrade() {
		return grade;
	}
	public void setGrade(char grade) {
		this.grade = grade;
	}
	
	public void printStudent() {
		System.out.println("Student-name: "+getName()+" Student-age: "+getAge()+" Roll-no.: "+rollno+" Grade: "+grade);
	}
	
}
