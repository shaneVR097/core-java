package CollectionsCncpt;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;

public class Employee2 implements Comparator<Employee2> {
	int id;
	String nm;
	double sal;
	
	public Employee2() {
		// TODO Auto-generated constructor stub
	}
	
	public Employee2(int id, String nm, double sal) {
		this.id=id;
		this.nm=nm;
		this.sal=sal;
	}
	
	@Override
	public int compare(Employee2 e1,Employee2 e2) {
		return e1.id-e2.id; //ascending sort
//		return e2.id-e1.id; //descending sort
	}
	
	public String toString() {
		return ("Id: "+this.id+",Name: "+this.nm+", Salary: "+this.sal+"\n");
	}
	
	public static void main(String[] args) {
		ArrayList<Employee2> emp= new ArrayList<Employee2>();
		emp.add( new Employee2(2,"shy",223));
		emp.add( new Employee2(1,"kri",24));
		emp.add( new Employee2(4,"sub",25));
		emp.add( new Employee2(3,"div",26));
		System.out.println(emp);
		
		Collections.sort(emp,new Employee2());
		System.out.println(emp);
	}
}
