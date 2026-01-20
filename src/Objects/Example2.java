package Objects;

public class Example2 {
	int a1;
	static int a2;
	Student s1;
	static Student s2;
	static Student s3=new Student();
	
	public void m1() {
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(this.a1);
		System.out.println(s1);
		System.out.println(s2);
	}
	
	public static void m2() {
		Example2 e=new Example2();
		System.out.println(e.a1);
		System.out.println(a2);
		System.out.println(e.s1);
//		System.out.println(e.s2); //The static field Example2.s2 should be accessed in a static way
	}
	
	public static void main(String[] args) {
		Example2 e=new Example2();
		e.m1();
		m2();
		Employee e2=null;
		Employee e3;
		e3=new Employee();
		System.out.println(e2);
		System.out.println(e3);
//		Employee e4;
		//System.out.println(e4); // not possible without initializing e4
		
		Student s4=new Student();
		s4.nm="Shyantan";
		s4.setpass(123);
		System.out.println(s4.getpass());
	}
	
	
}
