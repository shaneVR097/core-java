package Encapsulation;

public class WifiRouter {
	private long SSID;
	private int DevCnt;
	private int pw;
	
	public WifiRouter() {
		
	}
	
	public WifiRouter(long SSID, int DevCnt,int pw) {
		setSSID(SSID);
		setDevCnt(DevCnt);
		setPw(pw);
	}
	
	public long getSSID() {
		return SSID;
	}
	
	public void setSSID(long SSID) {
		this.SSID = SSID;
	}
	
	public int getDevCnt(int pw) {
		if(this.pw==pw)
			return DevCnt;
		else {
			System.out.println("Incorrect Password !!!");
			return 0;
		}
	}
	
	public void setDevCnt(int DevCnt) {
		if(DevCnt>0)
			this.DevCnt = DevCnt;
		else
			System.out.println("Device Count cannot be negative !!");
	}
	
	public int getPw() {
		return pw;
	}
	
	public void setPw(int pw) {
		int l=0,pw2=pw;
		while(pw2>0) {
			l++;
			pw2/=10;
		}
		if(l>=4 && l<=8)
			this.pw = pw;
		else 
			System.out.println("Pin length is not between 4 and 8, enter pin-length was: "+l);	
	}
}
