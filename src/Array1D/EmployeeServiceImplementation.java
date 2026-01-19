package Array1D;

public class EmployeeServiceImplementation implements EmployeeService {
	@Override
	public Employee[] getHighSalaryEmployee(Employee[] employees,double minsalary) {
		Employee[] hse=new Employee[employees.length];
		for(int i=0;i<employees.length;i++) {
			if(employees[i].sal>=minsalary) {
				hse[i]=employees[i];
			}
		}
		return hse;
	}
	
	public Employee[] getExperiencedEmployees(Employee[] employees,int minyears) {
		Employee[] mee=new Employee[employees.length];
		for(int i=0;i<employees.length;i++) {
			if(employees[i].exp>=minyears) {
				mee[i]=employees[i];
			}
		}
		return mee;
	}
	
	public double calculateAverageSalary(Employee[] employees) {
		double s=0.0;
		for(int i=0;i<employees.length;i++) {
			s+=employees[i].sal;
		}
		return (double)(s/employees.length);
	}
	public double getAverageSalaryBydept(Employee[] employees,String dept) {
		double s=0.0;
		int c=0;
		for(int i=0;i<employees.length;i++) {
			if(employees[i].getDept().equals(dept)) {
				s+=employees[i].sal;
				c++;
			}
		}
		if(c == 0) return 0.0;
		return (double)(s/c);
	}
	public Employee getTopPaidEmployee(Employee[] employees) {
		Employee top=new Employee();
		double mx=employees[0].sal;
		for(int i=0;i<employees.length;i++) {
			if(mx<employees[i].sal) {
				mx=employees[i].sal;
			}
		}
		for(int i=0;i<employees.length;i++) {
			if(mx==employees[i].sal) {
				top=employees[i];
				break;
			}
		}
		return top;
	}
	public Employee getTopPaidEmployeeByDept(Employee[] employees,String dept) {
		Employee top=null;
		double mx=Double.MIN_VALUE;
		boolean found=false;
		
		for(int i=0;i<employees.length;i++) {
			if(employees[i].getDept().equals(dept)) {
				if(!found || mx<employees[i].getSal()) {
					mx=employees[i].getSal();
					top=employees[i];
					found=true;
				}
			}
		}
		return top;
	}
	
}
