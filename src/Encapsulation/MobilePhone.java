package Encapsulation;

public class MobilePhone {
	private long IMEI;
	private int SimBlc;
	private int pin;
	
	public MobilePhone() {
		
	}
	
	public MobilePhone(long IMEI, int SimBlc,int pin) {
		setIMEI(IMEI);
		setSimBlc(SimBlc);
		setPin(pin);
	}
	
	public long getIMEI() {
		return IMEI;
	}
	
	public void setIMEI(long IMEI) {
		this.IMEI = IMEI;
	}
	
	public int getSimBlc(int pin) {
		if(this.pin==pin)
			return SimBlc;
		else {
			System.out.println("Incorrect Pin !!!");
			return 0;
		}
	}
	
	public void setSimBlc(int SimBlc) {
		if(SimBlc>0)
			this.SimBlc = SimBlc;
		else
			System.out.println("Sim Balance cannot be negative !!");
	}
	
	public int getPin() {
		return pin;
	}
	
	public void setPin(int pin) {
		int l=0,p2=pin;
		while(p2>0) {
			l++;
			p2/=10;
		}
		if(l>=4 && l<=6)
			this.pin = pin;
		else 
			System.out.println(" Pin length is not between 4 and 6, enter pin-length was: "+l);	
	}
}
