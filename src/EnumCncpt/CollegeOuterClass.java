package EnumCncpt;

public class CollegeOuterClass {
	static interface Staff{
		enum Gender{
			Male, Female;
		}
		enum Role{
			Teacher, Security_Guard;
		}
		void printSalary(double sal);
		void workDays(int days);
		void NumOfStaff(int m,int f);
	}
	
	static class Student{
		enum ModeOfAttending{
			Offline,Online;
		}
		enum Course{
			CSE,IT,ECE;
		}
		void feesPay(int yr,Course c,ModeOfAttending m, double fees) {
			System.out.println(yr+"-batch "+c+" students of "+m+"-mode have to pay "+fees+" half yearly\n");
		}
	}
	
	static class Teacher implements Staff {
		@Override
		public void printSalary(double sal) {
			System.out.println(Staff.Role.Teacher+" gets a salary of "+sal+"\n");
		}
		public void workDays(int days) {
			System.out.println(Staff.Role.Teacher+" has to work "+days+" no. of days a week\n");
		}
		public void NumOfStaff(int m,int f) {
			System.out.println("College has "+m+" "+Staff.Gender.Male+" & "+f+" "+Staff.Gender.Female+" "+Staff.Role.Teacher+" staffs\n");
		}
	}
	
	static class SecurityGuard implements Staff {
		@Override
		public void printSalary(double sal) {
			System.out.println(Staff.Role.Security_Guard+" gets a salary of "+sal+"\n");
		}
		public void workDays(int days) {
			System.out.println(Staff.Role.Security_Guard+" has to work "+days+" no. of days a week\n");
		}
		public void NumOfStaff(int m,int f) {
			System.out.println("College has "+m+" "+Staff.Gender.Male+" & "+f+" "+Staff.Gender.Female+" "+Staff.Role.Security_Guard+" staffs\n");
		}
	}
	
	public static void main(String[] args) {
		Student s=new Student();
		s.feesPay(2022, CollegeOuterClass.Student.Course.CSE, Student.ModeOfAttending.Offline, 75000.00);
		s.feesPay(2023, CollegeOuterClass.Student.Course.ECE, Student.ModeOfAttending.Offline, 85000.00);
		s.feesPay(2024, CollegeOuterClass.Student.Course.IT, Student.ModeOfAttending.Online, 95000.00);
		
		Teacher t=new Teacher();
		t.printSalary(63500.00);
		t.workDays(5);
		t.NumOfStaff(20, 15);
		
		SecurityGuard sg=new SecurityGuard();
		sg.printSalary(23500.00);
		sg.workDays(6);
		sg.NumOfStaff(10, 5);
	}
	
}
