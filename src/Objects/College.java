package Objects;

public class College {
	String nm;
	String loc;
	public void exam() {
		System.out.println(nm+" is taking exams");
	}
	public void cllgdeets() {
		System.out.println(nm+" is present at "+loc+" location");
	}
	public static void main(String[] args) {
		College c1=new College();
		College c2=new College();
		College c3=new College();
		c1.loc="Sector V"; c1.nm="IEM"; 
		c2.loc="Newtown"; c2.nm="UEM";
		c3.loc="Ruby"; c3.nm="HIT";
		c1.exam();
		c1.cllgdeets();
		c2.exam();
		c2.cllgdeets();
		c3.exam();
		c3.cllgdeets();
		
	}
}
