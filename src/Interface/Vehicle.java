package Interface;

public interface Vehicle {
	void price();
	void type();
}

class Car implements Vehicle {
	@Override
	public void price() {
		System.out.println("\nTata punch Car price: 5,60,000");
	}
	public void type() {
		System.out.println("\ncng");
	}
}

class Bike implements Vehicle {
	@Override
	public void price() {
		System.out.println("\nTVS Luna moped price: 56,000");
	}
	public void type() {
		System.out.println("\nPetrol");
	}
}

class Cycle implements Vehicle {
	@Override
	public void price() {
		System.out.println("\nHero cycle price: 5,600");
	}
	public void type() {
		System.out.println("\ngear");
	}
}