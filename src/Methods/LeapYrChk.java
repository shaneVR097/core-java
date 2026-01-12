package Methods;

public class LeapYrChk {
	public static void leapyr(int yr) {
		if(yr%400==0 || (yr%4==0 && yr%100!=0)) 
			System.out.println(yr+" is a Leap Year");
		else
			System.out.println(yr+" is Not a Leap Year");
	}
	public static void main(String[] args) {
		leapyr(1900);
		leapyr(1998);
		leapyr(2004);
		leapyr(2000);
	}
}
