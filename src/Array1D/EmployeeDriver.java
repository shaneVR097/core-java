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
            System.out.print("Enter Experience: ");
            int exp = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter Department: ");
            String dept = sc.nextLine();
            
            employees[i] = new Employee(id, name, salary, exp, dept);
        }
        
        EmployeeServiceImplementation service = new EmployeeServiceImplementation();
        
        System.out.print("\nEnter minimum salary to filter high salary employees: ");
        double minSalary = sc.nextDouble();
        
        Employee[] highSalaryEmployees = service.getHighSalaryEmployee(employees, minSalary);
        System.out.println("\nHigh Salary Employees:");
        for(Employee emp : highSalaryEmployees) {
            if(emp != null) {
                System.out.println(emp.getId()+" "+emp.getNm()+" "+emp.getSal());
            }
        }
        
        System.out.print("\nEnter minimum years for experienced employees: ");
        int minYears = sc.nextInt();
        
        Employee[] experiencedEmployees = service.getExperiencedEmployees(employees, minYears);
        System.out.println("\nExperienced Employees:");
        for(Employee emp : experiencedEmployees) {
            if(emp != null) {
                System.out.println(emp.getId()+" "+emp.getNm()+" "+emp.getExp());
            }
        }
        
        double avgSalary = service.calculateAverageSalary(employees);
        System.out.println("\nAverage Salary: "+avgSalary);
        
        sc.nextLine();
        System.out.print("\nEnter department for average salary: ");
        String deptAvg = sc.nextLine();
        double deptAvgSalary = service.getAverageSalaryBydept(employees, deptAvg);
        System.out.println("Average Salary for "+deptAvg+": "+deptAvgSalary);
        
        Employee topPaid = service.getTopPaidEmployee(employees);
        System.out.println("\nTop Paid Employee:");
        if(topPaid != null) {
            System.out.println(topPaid.getId()+" "+topPaid.getNm()+" "+topPaid.getSal());
        } else {
            System.out.println("No employees found");
        }
        
        System.out.print("\nEnter department for top paid employee: ");
        String deptTop = sc.nextLine();
        Employee topPaidDept = service.getTopPaidEmployeeByDept(employees, deptTop);
        System.out.println("Top Paid Employee in "+deptTop+":");
        if(topPaidDept != null) {
            System.out.println(topPaidDept.getId()+" "+topPaidDept.getNm()+" "+topPaidDept.getSal());
        } else {
            System.out.println("No employees found in department " + deptTop);
        }
        
        System.out.println("\nAll Employees:");
        for(Employee emp : employees) {
            System.out.println(emp.getId()+" "+emp.getNm()+" "+emp.getSal()+" "+emp.getExp()+" "+emp.getDept());
        }
        
        sc.close();
    }
}