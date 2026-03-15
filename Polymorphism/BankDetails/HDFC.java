package Polymorphism.BankDetails;

public class HDFC extends Bank {
    @Override
	void rateOfInterest() {
		System.out.println("HDFC Interest rate: 8.5%");
	}
	
	void withDraw() {
		System.out.println("WithDraw from HDFC ATM");
	}
	
	void transfer() {
		System.out.println("HDFC money transfer successfully");
	}
}
