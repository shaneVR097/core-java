package Encapsulation;

class UnauthorizedAccessException extends RuntimeException {
 public UnauthorizedAccessException(String message) {
     super(message);
 }
}

class InvalidSalaryException extends Exception {
 public InvalidSalaryException(String message) {
     super(message);
 }
}

interface Payroll {
 double calculatePayroll();
 String getPayrollType();
}


abstract class Employee {
 private final int employeeId;
 private String name;
 private String role;
 private double salary;  
 
 public Employee(int employeeId, String name, String role, double salary) throws InvalidSalaryException {
     if (salary < 0) {
         throw new InvalidSalaryException("Salary cannot be negative");
     }
     this.employeeId = employeeId;
     this.name = name;
     this.role = role;
     this.salary = salary;
 }
 
 public int getEmployeeId() {
     return employeeId;
 }
 
 public String getName() {
     return name;
 }
 
 public String getRole() {
     return role;
 }
 
 public double getSalary() {
     return salary;
 }
 
 public void setSalary(String requesterRole, double newSalary) throws InvalidSalaryException {
     if (!"HR".equalsIgnoreCase(requesterRole)) {
         throw new UnauthorizedAccessException("Only HR can modify salaries");
     }
     
     if (newSalary < 0) {
         throw new InvalidSalaryException("Salary cannot be negative");
     }
     
     this.salary = newSalary;
 }
 
 public void setSalary(String requesterRole, double percentage, boolean isIncrease) throws InvalidSalaryException {
     if (!"HR".equalsIgnoreCase(requesterRole)) {
         throw new UnauthorizedAccessException("Only HR can modify salaries");
     }
     
     double adjustment = isIncrease ? (1 + percentage/100) : (1 - percentage/100);
     double newSalary = this.salary * adjustment;
     
     if (newSalary < 0) {
         throw new InvalidSalaryException("Adjusted salary cannot be negative");
     }
     
     this.salary = newSalary;
 }
 
 public void setName(String name) {
     this.name = name;
 }
 
 public void setRole(String role) {
     this.role = role;
 }
 
 public abstract Payroll getPayroll();
}

class FullTimeEmployee extends Employee implements Payroll {
 private static final double BONUS_PERCENTAGE = 10.0;
 
 public FullTimeEmployee(int employeeId, String name, String role, double salary) throws InvalidSalaryException {
     super(employeeId, name, role, salary);
 }
 
 @Override
 public double calculatePayroll() {
     double bonus = super.getSalary() * (BONUS_PERCENTAGE / 100);
     return super.getSalary() + bonus;
 }
 
 @Override
 public String getPayrollType() {
     return "Full-Time Monthly Payroll";
 }
 
 @Override
 public Payroll getPayroll() {
     return this;
 }
}

class ContractEmployee extends Employee {
	 private int contractDuration;
	 
	 public ContractEmployee(int employeeId, String name, String role, double salary, int contractDuration) throws InvalidSalaryException {
	     super(employeeId, name, role, salary);
	     if (contractDuration <= 0) {
	         throw new InvalidSalaryException("Contract duration must be positive");
	     }
	     this.contractDuration = contractDuration;
	 }
	 
	 private class ContractPayroll implements Payroll {
	     @Override
	     public double calculatePayroll() {
	         return ContractEmployee.super.getSalary() / contractDuration;
	     }
	     
	     @Override
	     public String getPayrollType() {
	         return "Contract-based Payroll";
	     }
	 }
	 
	 @Override
	 public Payroll getPayroll() {
	     return new ContractPayroll();
	 }
	 
	 public int getContractDuration() {
	     return contractDuration;
	 }
	 
	 public void setContractDuration(int contractDuration) throws InvalidSalaryException {
	     if (contractDuration <= 0) {
	         throw new InvalidSalaryException("Contract duration must be positive");
	     }
	     this.contractDuration = contractDuration;
	 }
}

public class EmployeePayrollSystem {
 public static void main(String[] args) {
     try {
     
         FullTimeEmployee emp1 = new FullTimeEmployee(101, "John Doe", "Developer", 50000);
         ContractEmployee emp2 = new ContractEmployee(102, "Jane Smith", "Consultant", 60000, 12);
         FullTimeEmployee hrEmp = new FullTimeEmployee(103, "HR Manager", "HR", 70000);
         
         System.out.println("Employee 1 Salary (via getter): $" + emp1.getSalary());
         System.out.println("Employee 2 Salary (via getter): $" + emp2.getSalary());
         
         System.out.println("Full-time Employee Annual Payroll: $" + emp1.calculatePayroll());
         System.out.println("Contract Employee Monthly Payroll: $" + emp2.getPayroll().calculatePayroll());
         
         try {
             emp1.setSalary("Developer", 55000);
             System.out.println("ERROR: Should not reach here!");
         } catch (UnauthorizedAccessException e) {
             System.out.println(" Unauthorized Access Exception : " + e.getMessage());
         }
         
       
         try {
             emp1.setSalary("HR", 55000);
             System.out.println(" Salary successfully updated to: $" + emp1.getSalary());
         } catch (Exception e) {
             System.out.println("ERROR: " + e.getMessage());
         }
         
        
        
         try {
             emp2.setSalary("HR", 15.0, true);
             System.out.println("New salary after 15% increase: $" + emp2.getSalary());
         } catch (Exception e) {
             System.out.println("ERROR: " + e.getMessage());
         }
         
         
         
         try {
             FullTimeEmployee invalidEmp = new FullTimeEmployee(104, "Test", "Tester", -10000);
             System.out.println("ERROR: Should not create employee with negative salary!");
         } catch (InvalidSalaryException e) {
             System.out.println(" Invalid Salary Exception : " + e.getMessage());
         }
          
         System.out.println("Full-time Payroll Type: " + emp1.getPayrollType());
         System.out.println("Contract Payroll Type: " + emp2.getPayroll().getPayrollType());
           
         try {
             modifySalaryWithPropagation(emp1, "Manager", 60000);
         } catch (Exception e) {
             System.out.println(" Exception : " + e.getClass().getSimpleName());
         }
     } catch (Exception e) {
         System.out.println("Unexpected error: " + e.getMessage());
         e.printStackTrace();
     }
 }
 
 private static void modifySalaryWithPropagation(Employee emp, String role, double newSalary) throws InvalidSalaryException {
     emp.setSalary(role, newSalary);
 }
}