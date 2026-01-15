package SuperCallUsage;

public class Child extends Parent {
	long phno;
	int a=20;
	Child(){
		
	}
	public Child (String nm,long phno) {
		super(nm); // call via super call statement if no argument constructor is not created in parent class and members have to be inherited or passed to parents from child
		//this.nm=nm; // it will work only when no argument constructor is created in parent class 
		this.phno=phno;
	}
	public void m2() {
		System.out.println("Child class method m2 var 'a' value= "+a);
		System.out.println("parent method var 'a' value= "+super.a);
		super.m1();
		this.m1();
		System.out.println(this);
		//System.out.println(super); //parent object reference
	}
	public static void main(String[] args) {
		Child c=new Child("xyz",899);
		System.out.println(c.nm+" "+c.phno);
		c.m1();
		c.m2();
	}
}
