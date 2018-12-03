package learnJava;

public class BankDriver {
	public static void main(String[] args) {
		HFDC hf = new HFDC();
		hf.deposit();
		hf.withDraw();
		hf.calculateInterest();
	}
}
