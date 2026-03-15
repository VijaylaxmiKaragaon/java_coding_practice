package Polymorphism.BankDetails;

public class SBI extends Bank{
    @Override
	void rateOfInterest() {
		System.out.println("SBI Interest rate: 6%");
	}
	
	void withDraw() {
		System.out.println("WithDraw from SBI ATM");
	}
	
	void transfer() {
		System.out.println("SBI money transfer successfully");
	}
}
