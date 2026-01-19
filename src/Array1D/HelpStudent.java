package Array1D;
import java.util.Scanner;
public class HelpStudent {
	Scanner sc=new Scanner(System.in);
	public void inputstudent(Student[] s) {
		System.out.println("Enter Student info:- \n");
		for(Student i:s) {
			System.out.println("Enter student id: ");
			i.id=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter student name: ");
			i.nm=sc.nextLine();
			System.out.println("Enter Student marks: ");
			i.marks=sc.nextInt();
		}
	}
	public static Student[] passStudent(Student[] s,int pm) {
		Student[] ps;
		int c=0;
		for(Student i:s) {
			if(i.marks>pm)
				c++;
		}
		ps=new Student[c];
		int j=0;
		for(Student i:s) {
			if(i.marks>=pm) {
				ps[j]=i;
				j++;
			}
		}
		return ps;
	}
	public void closescanner() {
		sc.close();
	}
}
