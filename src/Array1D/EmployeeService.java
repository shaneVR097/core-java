package Array1D;

public interface EmployeeService {
	Employee[] getHighSalaryEmployee(Employee[] employees,double minsalary);
	double calculateAverageSalary(Employee[] employees);
	Employee getTopPaidEmployee(Employee[] employees);
	
	//assignment
//	Employee[] getExperiencedEmployees(Employee[] employees,int minyears);
//	Employee getToppaidEmployeebyDept(Employee[] employees,String dept);
//	double getAverageSalaryBydept(Employee[] employees,String dept);
}
