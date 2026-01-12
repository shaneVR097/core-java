package Methods;
import java.util.Scanner;
public class ScannerExample {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter a number: ");
//		int n=sc.nextInt();
//		System.out.println(n);
		
		String name="";
		String email="";
		long phno=0;
		boolean marital_status=false;
		int superset_id=0;
		float weight=0.0f;
		double height = 0.0;
		char gender='\u0000';
		short roll_no=0;
		byte age=0;
		
		System.out.print("Enter your weight: ");
		weight=sc.nextFloat();
		System.out.print("Enter your name: ");
		sc.nextLine();
		name=sc.nextLine();
		System.out.print("Enter your age: ");
		age=sc.nextByte();
		System.out.print("Enter your Phone number: ");
		phno=sc.nextLong();
		System.out.print("Enter your email: ");
		sc.nextLine();
		email=sc.nextLine();
		System.out.print("Enter your gender: ");
		gender=sc.next().charAt(0);
		System.out.print("Enter your Marital Status: ");
		marital_status=sc.nextBoolean();
		System.out.print("Enter your superset_id: ");
		superset_id=sc.nextInt();
		System.out.print("Enter your height: ");
		height=sc.nextDouble();
		System.out.print("Enter your roll-no.: ");
		roll_no=sc.nextShort();
		
		System.out.println("Name: "+name);
		System.out.println("Email: "+email);
		System.out.println("Phone no.: "+phno);
		System.out.println("Marital Status: "+marital_status);
		System.out.println("Age: "+age+" | Weight: "+weight+" | Height: "+height+" | Gender: "+gender);
		System.out.println("Roll no.: "+roll_no+" | Superset id: "+superset_id);
		
		sc.close();
	}
}
