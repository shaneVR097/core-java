package Objects;

public class Student {
	int id; //non static variables
	String nm;
	String clgnm="IEM";
	private int pass;
	public int getpass() {
		return pass;
	}
	public void setpass(int pass) {
		this.pass=pass;
	}
	public void student_init(int id,String nm) {
		this.id=id;
		this.nm=nm;
		System.out.println("name: "+nm+" id: "+id);
	}
	public void study() {
		System.out.println("Student is studying");
	}
	public void study2() {
		System.out.println("Student is not studying");
	}
	{ //non static block 1
		System.out.println("N-S 1");
	}
	{ //non static block 2
		System.out.println("N-S 2");
	}
	public static void main(String[] args) {
		System.out.println("main start");
		Student s=new Student();
		Student s2=new Student();
		System.out.println(s);
		System.out.println(s.id+" "+s.nm+" "+s.clgnm);
		s2.id=1; s2.nm="Max";
		System.out.println(s2.id+" "+s2.nm+" "+s2.clgnm);
		s.study();
		s2.study2();
		Student s3=new Student();
		s3.student_init(4, "simon");
		s3.student_init(5, "sam");
		System.out.println("main end");
	}
	
}
