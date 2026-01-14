package Encapsulation;

public class TrainerDriver {
	public static void main(String[] args) {
		Trainer t=new Trainer();
		t.setID(1);
		t.setNM("John");
		t.setPW(123);
		System.out.println("Trainer ID: "+t.getID()+" Trainer Name: "+t.getNM()+" Trainer Password: "+t.getPW()+"\n");
		Trainer t2=new Trainer(2,"Max",908);
		System.out.println("Trainer ID: "+t2.getID()+" Trainer Name: "+t2.getNM()+" Trainer Password: "+t2.getPW()+"\n");
		Account a=new Account();
		a.setID(3);
		a.setBLC(-19);
		a.setBLC(19080);
		a.setPW(456);
		System.out.println("Account ID: "+a.getID()+" Account balance: "+a.getBLC(451)+" Trainer Password: "+a.getPW()+"\n");
		System.out.println("Account ID: "+a.getID()+" Account balance: "+a.getBLC(456)+" Trainer Password: "+a.getPW()+"\n");
		MobilePhone m=new MobilePhone();
		m.setIMEI(3);
		m.setSimBlc(-19);
		m.setSimBlc(629);
		m.setPin(191);
		m.setPin(456789);
		System.out.println("Phone IMEI: "+m.getIMEI()+" Sim balance: "+m.getSimBlc(451)+" Trainer Password: "+m.getPin()+"\n");
		System.out.println("Phone IMEI: "+m.getIMEI()+" Sim balance: "+m.getSimBlc(456789)+" Trainer Password: "+m.getPin()+"\n");
		WifiRouter w=new WifiRouter();
		w.setSSID(244098756);
		w.setDevCnt(-10);
		w.setDevCnt(12);
		w.setPw(346);
		w.setPw(456789);
		System.out.println("Wifi SSID: "+w.getSSID()+" Device Count: "+w.getDevCnt(342)+" Wifi Password: "+w.getPw()+"\n");
		System.out.println("Wifi SSID: "+w.getSSID()+" Device Count: "+w.getDevCnt(346)+" Wifi Password: "+w.getPw()+"\n");
	}
}
