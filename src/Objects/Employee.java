package Objects;
import java.util.Scanner;

public class Employee {
	int id;
	String nm;
	double sal;
	public void init(int id,String nm, double sal) {
		this.id=id;
		this.nm=nm;
		this.sal=sal;
	}
	public void work() {
		System.out.println(nm+" is working at "+sal+" salary");
	}
	public void display() {
		System.out.println("Name: "+nm+" id: "+id+" Salary: "+sal);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Employee e1=new Employee();
		Employee e2=new Employee();
		Employee e3=new Employee();
		e1.id=1; e1.nm="john"; e1.sal=20000.01; 
		e2.id=2; e2.nm="max"; e2.sal=21000.02; 
		e3.id=3; e3.nm="rob"; e3.sal=22000.03;
		e1.work();
		e2.work();
		e3.work();
		System.out.println("Enter number of more employees to create: ");
		int en=sc.nextInt();
		for(int i=0;i<en;i++) {
			Employee e4=new Employee();
			System.out.print("Enter Employee-id: ");
			e4.id=sc.nextInt();
			System.out.print("Enter Employee-name: ");
			sc.nextLine();
			e4.nm=sc.nextLine();
			System.out.print("Enter Employee-salary: ");
			e4.sal=sc.nextDouble();
			
			System.out.println("Entered Employee details are:\n "+"\nEmployee Name: "+e4.nm+"\nEmployee-id: "+e4.id+"\nEMployee-salary: "+e4.sal);
		}
		sc.close();
		Employee e5=new Employee();
		e5.display();
		e5.init(6, "viswa kumar", 26010.97);
		e5.display();
	}
	
}
