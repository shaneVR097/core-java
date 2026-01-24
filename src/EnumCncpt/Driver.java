package EnumCncpt;

import java.time.Month;

public class Driver {
	Day day;
	enum Months {Jan,Feb,Mar,Apr,Jun,Jul,Aug,Sept,Oct,Nov,Dec;}
	
	public static void main(String[] args) {
		System.out.println(Day.Mon);
		Day d=Day.Thursa;
		System.out.println(d);
		System.out.println(Months.Apr);
		Driver dr=new Driver();
		dr.day=Day.Sat;
		System.out.println(dr.day);
	}
}
