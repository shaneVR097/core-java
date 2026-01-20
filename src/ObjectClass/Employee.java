package ObjectClass;
import java.util.Scanner;
import java.util.Objects;
public class Employee {
	String nm;
	int id;
	double sal;
	String dept;
	Employee(int id,String nm,double sal,String dept){
		this.id=id;
		this.nm=nm;
		this.sal=sal;
		this.dept=dept;
	}
	@Override
	public String toString() {
		return ("id: "+id+" name: "+nm+" salary: "+sal+" dept: "+dept); 
	}
	public int hashCode() {
		return Objects.hash(id,nm,sal,dept);
	}
	public boolean equals(Object o) {
		if(o==null){
			System.out.println("Null object reference !!");
			return false;
		}
		if(o.getClass()!=this.getClass()) {
			System.out.println("Class mismatch !!");
			return false;
		}
		if(this==o)
			return true;
		Employee e=(Employee) o;
		if(this.id==e.id && this.nm==e.nm)
			return true;
		else
			return false;
	}
	public boolean compareContent(Employee e) {
		if(this.hashCode()==e.hashCode())
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) {
		Employee e=new Employee(10,"xyz",22000.09,"dev");
		System.out.println(e);
		System.out.println(e.toString());
		Scanner sc=new Scanner(System.in);
		
		Employee e2=new Employee(10,"xyz",22000.09,"dev");
		Employee e3=new Employee(10,"xyz",22000.09,"dev");
		System.out.println("\nCheck same object content: "+e2.compareContent(e3));
		System.out.println("\nCheck eqaulity of objects: "+e3.equals(e2));
		Employee e4=null;
		System.out.println("\nCheck null-pointer-exception: "+e2.equals(e4));
		Person p=new Person(10,"xyz");
		System.out.println("\nCheck class-cast-exception: "+e2.equals(p));
		System.out.println("\nCheck same-class: "+e2.equals(e3));
		System.out.println("\nCheck same-object: "+e2.equals(e2));
//		System.out.println("Enter number of employees: ");
//		int n=sc.nextInt();
//		Employee[] ea=new Employee[n];
//		for(int i=0;i<n;i++) {
//			int id;
//			String nm;
//			double sal;
//			String dept;
//			
//			System.out.println("Enter id: ");
//			id=sc.nextInt();
//			sc.nextLine();
//			System.out.println("Enter name: ");
//			nm=sc.nextLine();
//			System.out.println("Enter salary: ");
//			sal=sc.nextDouble();
//			sc.nextLine();
//			System.out.println("Enter Department: ");
//			dept=sc.nextLine();
//			ea[i]=new Employee(id, nm, sal, dept);
//		}
//		for(int i=0;i<n;i++) {
//			System.out.println(ea[i].toString());
//			System.out.println(ea[i].hashCode());
//		}
		sc.close();
	}
}

