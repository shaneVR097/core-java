package CollectionsCncpt;

import java.util.ArrayList;
import java.util.List;

public class Student {
	private int id;
	private String nm;
	private int marks;
	public Student() {

	}
	public Student(int id,String nm,int marks) {
		setId(id);
		setNm(nm);
		setMarks(marks);
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNm() {
		return nm;
	}
	public void setNm(String nm) {
		this.nm = nm;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	@Override
	public String toString() {
		return ("Id:"+this.id+", Name: "+this.nm+", Marks: "+this.marks);
	}
	
	public void printStudents(List<Student> sl) {
		if(sl==null || sl.isEmpty()) {
			System.out.println("\nNo students to print details about");
			return;
		}
		for(Student s:sl) {
			System.out.println(s.toString());
		}
	}
	
	public void printStudents(Student s) {
		if(s==null) {
			System.out.println("\nNo student to print details about");
			return;
		}
		
		System.out.println(s.toString());
	}
	
	public List<Student> filterPassedStudents(List<Student> sl,int passingMarks){
		if(sl==null || sl.isEmpty()) {
			System.out.println("\nNo students to find passing details about");
			return null;
		}
		List<Student> sp=new ArrayList<Student>();
		for(Student s:sl) {
			if(s.marks>=passingMarks)
				sp.add(s);
		}
		System.out.println("\nStudents who have passed with marks above "+passingMarks+" are:-");
		printStudents(sp);
		return sp;
	}
	
	public List<Integer> numOfPassFail(List<Student> sl){
		if(sl==null || sl.isEmpty()) {
			System.out.println("\nNo students to find passing details about");
			return null;
		}
		Student s=new Student();
		System.out.println("\nPassing marks is assumed to be 40");
		List<Student> sp= s.filterPassedStudents(sl, 40);
		int p=sp.size();
		int f=sl.size()-p;
		List<Student> sf=new ArrayList<Student>();
		
		for(Student sn:sl) {
			boolean passed=false;
			for(Student spp:sp) {
				if(spp.equals(sn)) {
					passed=true;
					break;
				}
			}
			if(passed==false) {
					sf.add(sn);
			}	
		}	
			
		System.out.println("\nNumber of Students who have passed with marks above "+40+" are= "+p);
		System.out.println("\nNumber of Students who have failed with marks below "+40+" are= "+f+"\nAnd their list goes as follows:- ");
		s.printStudents(sf);
		ArrayList<Integer> pf = new ArrayList<Integer>();
		pf.add(p);
		pf.add(f);
		return pf;
	}
	
	public Student topper(List<Student> sl){
		if(sl==null || sl.isEmpty()) {
			System.out.println("\nNo students to find Topper among");
			return null;
		}
		Student top=new Student();
		int mx=sl.get(0).marks;
		for(Student s:sl) {
			mx = (mx<s.marks) ? s.marks : mx; 
		}
		for(Student s:sl) {
			top = (mx==s.marks) ? s: null; 
		}
		System.out.println("\nStudent who has topped is:- ");
		printStudents(top);
		return top;
	}

	public Student searchByName(List<Student> sl,String srchnm){
		if(sl==null || sl.isEmpty() || srchnm.isEmpty()) {
			System.out.println("\nNo students to find among !!");
			return null;
		}
		Student srchd=new Student();
		for(Student s:sl)
			if(srchnm.equalsIgnoreCase(s.nm)) {
				srchd=s;
				break;
			}
		System.out.println("\nSearched Student is:- ");
		printStudents(srchd);
		return srchd;
	}
	
	public static void main(String[] args) {
		List<Student> students = new ArrayList<Student>();
		students.add( new Student(1,"Hari",42));
		students.add( new Student(2,"Om",40));
		students.add( new Student(3,"Shyam",31));
		students.add( new Student(4,"Jadu",32));
		students.add( new Student(5,"Ram",39));
		students.add( new Student(6,"Karan",43));
		Student s=new Student();
		System.out.println("All students are:-\n");
		s.printStudents(students);
		s.filterPassedStudents(students, 40);
		s.topper(students);
		s.searchByName(students, "ram");
		List<Integer> pf=s.numOfPassFail(students);
		System.out.println("\nPassed: "+pf.get(0)+" Failed: "+pf.get(1));	
	}
}