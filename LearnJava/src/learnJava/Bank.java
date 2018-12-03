package learnJava;

abstract class Bank {
	public void deposit() {
		System.out.println("This is deposit method.");
	}
	public void withDraw() {
		System.out.println("This is withdraw method.");
	}
	public abstract int calculateInterest();
}

class HFDC extends Bank {
	
	@Override
	public int calculateInterest() {
		System.out.println("Interest calculations.");
		return 0;
	}
	
}