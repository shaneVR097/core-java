package Relationship;

public class DriverClass {
	public static void main(String[] args) {
		Engine eng=new Engine(2000,"Petrol");
		Car c=new Car(567,"Kia","Black",eng);
		c.printCar();
		c.getE().printEngine();
		
		Student s=new Student(12,"Shyantan");
		Trainer t=new Trainer("Sandeep","Java",s);
		College k = new College("IEM","Sector V",s,t);
		k.printCollege();
		k.getS().printStudent();
		k.getT().printTrainer();
	}
}
