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
	public double calculateAverageSalary(Employee[] employees) {
		double s=0.0;
		for(int i=0;i<employees.length;i++) {
			s+=employees[i].sal;
		}
		return (double)(s/employees.length);
	}
	public Employee getTopPaidEmployee(Employee[] employees) {
		Employee top=new Employee();
		double mx=employees[0].sal;
		for(int i=0;i<employees.length;i++) {
			if(mx<employees[i].sal) {
				top=employees[i];
			}
		}
		return top;
	}
}
