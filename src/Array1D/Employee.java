package Array1D;

public class Employee {
	int id;
	String nm;
	double sal;
	// dept, experience
	Employee(){
		
	}
	
	Employee(int id,String nm,double sal){
		setId(id);
		setNm(nm);
		setSal(sal);
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
}
