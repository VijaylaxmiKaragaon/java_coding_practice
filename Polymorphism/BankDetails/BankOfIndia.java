package Polymorphism.BankDetails;

public class BankOfIndia extends Bank {
    @Override
	void rateOfInterest() {
		System.out.println("Bank of India Interest rate: 8%");
	}
	
	void withDraw() {
		System.out.println("WithDraw from Bank of India ATM");
	}
	
	void transfer() {
		System.out.println("Bank Of India money transfer successfully");
	}
	
}
