package SuperCallUsage;

public class Student extends Human {
	float pc;
	Student(String nm,int age,char gender,float pc){
		super(nm,age,gender);
		this.pc=pc;
	}
	public void printStudent() {
		System.out.println("Student details: "+nm+" "+age+" "+gender+" "+pc);
	}
	public static void main(String[] args) {
		Student s=new Student("Shyamali",12,'F',91.67f);
		s.printHuman();
		s.printStudent();
		
	}
}

