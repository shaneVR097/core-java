package CollectionsCncpt;

public class Employee {
	int id;
	String nm;
	double sal;
	String dept;
	
	public Employee(int id,String nm,double sal,String dept) {
		this.id=id;
		this.nm=nm;
		this.sal=sal;
		this.dept=dept;
	}
	
	@Override
	public String toString(){
		return ("Id: "+this.id+" Name: "+this.nm+" Salary: "+this.sal+" Departement: "+this.dept);
	}
	
}
