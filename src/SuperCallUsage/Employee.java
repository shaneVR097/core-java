package SuperCallUsage;

public class Employee extends Human {
	
	int id;
	double sal;
	Employee(String nm,int age,char gender,int id,double sal){
		super(nm,age,gender);
		this.id=id;
		this.sal=sal;
	}
	public void printEmployee() {
		System.out.println("Employee details: "+nm+" "+age+" "+gender+" "+id+" "+sal);
	}
	public static void main(String[] args) {
		Employee e=new Employee("Ram",32,'M',12,33000.00);
		e.printHuman();
		e.printEmployee();
		
	}
}
