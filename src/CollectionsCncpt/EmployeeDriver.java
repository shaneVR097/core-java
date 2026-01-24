package CollectionsCncpt;
import java.util.ArrayList;
import java.util.List;
public class EmployeeDriver {
	public static void main(String[] args) {
		List<Employee> emp =new ArrayList<Employee>();
		emp.add( new Employee(1,"hari",20000.00,"dev"));
		emp.add( new Employee(2,"om",21000.00,"dev"));
		emp.add( new Employee(3,"shyam",21000.00,"cloud"));
		emp.add( new Employee(4,"jadu",23000.00,"cloud"));
		List<Employee> empcloud =findempbydept(emp, "cloud");
		List<Employee> empdev =findempbydept(emp, "dev");
		List<Employee> emp21 =findempbysal(emp, 21000.00);
		for(Employee e:empcloud) {
			System.out.println(e.toString());
		}
		for(Employee e:empdev) {
			System.out.println(e.toString());
		}
		for(Employee e:emp21) {
			System.out.println(e.toString());
		}
	}
	public static List<Employee> findempbydept(List<Employee> emp,String dept){
		List<Employee> emp2=new ArrayList<Employee>();
		for(Employee e:emp) {
			if(e.dept.equals(dept)) {
				emp2.add(e);
			}
		}
		return emp2;
	}
	public static List<Employee> findempbysal(List<Employee> emp,double minsal){
		List<Employee> emp2=new ArrayList<Employee>();
		for(Employee e:emp) {
			if(e.sal>=minsal) {
				emp2.add(e);
			}
		}
		return emp2;
	}
}
