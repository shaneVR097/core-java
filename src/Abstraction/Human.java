package Abstraction;

public class Human {
	private Heart heart;
	private Address address;
	public Heart getHeart() {
		return heart;
	}

	public void setHeart(Heart heart) {
		this.heart = heart;
	}

	public Address getAddress() { //weak has-a relationship of aggregation type
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}


	public Human() {
		heart=new Heart(); //strong has-a relationship of composition type
	}
	
	public static void main(String[] args) {
		Human human=new Human();
		human.heart.pump();
		//human.address=new Address();
		human.setAddress(new Address());
		human.getAddress().location();
		//Human[] harr=new Human[2]; //non primitive data type array 
	}
}

class Heart{
	public void pump() {
		System.out.println("heart is pumping\n");
	}
}

class Address{
	void location() {
		System.out.println("location is south-east asia\n"); 
	}
}