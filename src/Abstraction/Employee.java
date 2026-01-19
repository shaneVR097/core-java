package Abstraction;

public abstract class Employee {
	int id;
	String nm;
	public Employee(){
		
	}
	public Employee(int id,String nm) {
		this.id=id;
		this.nm=nm;
	}
	public abstract void printEmployee(); 
	public static void main(String[] args) {
		Raju r=new Raju(10,"raju",100000.00);
		r.printEmployee();
		Employee e=new Raju(20,"raju2",20000.00);
		e.printEmployee();
		
	}
}

class Raju extends Employee {
	double sal;
	public Raju(int id,String nm,double sal) {
		super(id,nm);
		this.sal=sal;
	}
	@Override
	public void printEmployee() {
		System.out.println(id+" "+nm+" "+sal);
	}
}
