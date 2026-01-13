package Objects;

public class StudentChaining2 {
	int id;
	String nm;
	long phn;
	public StudentChaining2(int id) {
		this.id=id;
		//this(id); constructor method cant call itself otherwise infinite recursion
	}
	public StudentChaining2(int id, String nm) {
		this(id);
		//this(id,nm); //recursive constructor invocation StudentChaining2(int, String)
		this.nm=nm;
	}
	public StudentChaining2(int id, String nm,long phn) {
		this(id,nm);
		this.phn=phn;
	}
	public void display() {
		System.out.println(id);
		System.out.println(nm);
		System.out.println(phn);
		System.out.println("----- ----- ----");
	}
	public static void main(String[] args) {
		StudentChaining2 s1=new StudentChaining2(11,"xyz",888);
		s1.display();
		StudentChaining2 s2=new StudentChaining2(12);
		s2.display();
		StudentChaining2 s3=new StudentChaining2(13,"wxy");
		s3.display();
	}
}
