package Interface;

public interface Job {
	void servicetype();
	void role();
}

class PrimaryJob implements Job {
	@Override
	public void servicetype() {
		System.out.println("\nCapgemini");
	}
	public void role() {
		System.out.println("\nBack-end Developer");
	}
}

class Freelancer implements Job {
	@Override
	public void servicetype() {
		System.out.println("\nFreelancing");
	}
	public void role() {
		System.out.println("\nFull stack");
	}
}