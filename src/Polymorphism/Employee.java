package Polymorphism;

public class Employee {
	int id;
	String name;
	double sal;
	String dept;
	Employee(){
		
	}
	Employee(int id){
		this.id=id;
	}
	Employee(int id,String name){
		this(id); // this() is this-call statement to reduce initialization steps //constructor chaining and constructor overloading
		this.name=name;
	}
	Employee(int id,String name,double sal){
		this(id,name); // this() is this-call statement to reduce initialization steps
		this.sal=sal;
	}
	Employee(int id,String name,double sal,String dept){
		this(id,name,sal); // this() is this-call statement to reduce initialization steps
		this.dept=dept;
	}
	public void printEmployee() {
		System.out.println("Employee-id: "+id+", Name:"+name+", Salary: "+sal+", Department: "+dept);
	}
	
	public static void main(String[] args) {
		Employee e1=new Employee(12);
		Employee e2=new Employee(13,"Shyantan");
		Employee e3=new Employee(14,"Krishnendu",22000.01);
		Employee e4=new Employee(15,"Arijit",23000.02,"Dev");
		e1.printEmployee();
		e2.printEmployee();
		e3.printEmployee();
		e4.printEmployee();
		
		
	}
}
