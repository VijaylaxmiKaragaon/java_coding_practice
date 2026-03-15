package Polymorphism.BankDetails;

public class ICICI extends Bank{
    
	@Override
	void rateOfInterest() {
		System.out.println("ICICI Interest rate: 7%");
	}
	
	void withDraw() {
		System.out.println("WithDraw from ICICI ATM");
	}
	
	void transfer() {
		System.out.println("ICICI money transfer successfully");
	}
}
