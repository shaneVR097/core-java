package Array1D;

public class Employee {
	int id;
	String nm;
	double sal;
	int exp;
	String dept;
	Employee(){
		
	}
	
	Employee(int id,String nm,double sal,int exp, String dept){
		setId(id);
		setNm(nm);
		setSal(sal);
		setExp(exp);
		setDept(dept);
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNm() {
		return nm;
	}
	public void setNm(String nm) {
		this.nm = nm;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

}
