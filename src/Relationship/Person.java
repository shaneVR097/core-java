package Relationship;

public class Person {
	String name;
	PanCard pc;
	public static void main(String[] args) {
		Person p=new Person();
		p.name="Shyantan";
		PanCard card=new PanCard();
		card.panID="ABC987";
		card.dob=14042001;
		p.pc=card;//has-a relationship of composition-type
		System.out.println("Person name: "+p.name+", Person-dob: "+p.pc.dob+", Person pan-id: "+p.pc.panID);
	}
}
