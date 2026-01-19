package Array1D;

public class Student {
	int id;
	String nm;
	int marks;
	public Student(int id,String nm,int marks) {
		this.id=id;
		this.nm=nm;
		this.marks=marks;
	}
	public static Student[] filterstudentonmarks(Student[] students,int pass) {
		Student[] passstudents=new Student[students.length];
		for(int i=0;i<students.length;i++) {
			if(students[i].marks>=pass) {
				passstudents[i]=students[i];
			}
		}
		return passstudents;
	}
}
