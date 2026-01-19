package Array1D;
import java.util.Scanner;

public class EmployeeDriver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();
        
        Employee[] employees = new Employee[n];
        
        System.out.println("\nEnter employee details:");
        for(int i = 0; i < n; i++) {
            System.out.println("\nEmployee " + (i + 1) + ":");
            System.out.print("Enter ID: ");
            int id = sc.nextInt();
            sc.nextLine(); 
            System.out.print("Enter Name: ");
            String name = sc.nextLine();
            System.out.print("Enter Salary: ");
            double salary = sc.nextDouble();
            employees[i] = new Employee(id, name, salary);
        }
        
        EmployeeServiceImplementation service = new EmployeeServiceImplementation();
        System.out.print("\nEnter minimum salary to filter high salary employees: ");
        double minSalary = sc.nextDouble();
        
        Employee[] highSalaryEmployees = service.getHighSalaryEmployee(employees, minSalary);
        System.out.println("\n=== High Salary Employees (Salary >= " + minSalary + ") ===");
        int count = 0;
        for(Employee emp : highSalaryEmployees) {
            if(emp != null) {
                System.out.println("ID: " + emp.id + ", Name: " + emp.nm + ", Salary: " + emp.sal);
                count++;
            }
        }
        System.out.println("Total high salary employees: " + count);
        
        double avgSalary = service.calculateAverageSalary(employees);
        System.out.printf("Average Salary of all employees: %.2f\n", avgSalary);
        

        Employee topPaid = service.getTopPaidEmployee(employees);
        System.out.println("\n=== Top Paid Employee ===");
        System.out.println("ID: "+topPaid.id+", Name: "+topPaid.nm+", Salary: "+topPaid.sal+" (Highest Salary)");
        

        for(Employee emp : employees) {
            System.out.println("ID: "+emp.id+", Name: "+emp.nm+", Salary: "+emp.sal);
        }
        
        sc.close();
    }
}