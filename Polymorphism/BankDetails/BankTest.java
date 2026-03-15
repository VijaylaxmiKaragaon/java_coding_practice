package Polymorphism.BankDetails;

public class BankTest {
    public static void main(String[] args) {
		Bank b = new Bank();
		System.out.println("Bank Details are");
		b.rateOfInterest();
		b.withDraw();
		b.transfer();
		
		System.out.println("------------");
		System.out.println("SBI Details:");
		Bank b1 = new SBI();
		b1.rateOfInterest();
		b1.withDraw();
		b1.transfer();
		
		System.out.println("------------");
		System.out.println("BankOfIndia Details are: ");
		Bank b2 =  new BankOfIndia();
		b2.rateOfInterest();
		b2.withDraw();
		b2.transfer();
		
		System.out.println("------------");
		System.out.println("HDFC Details are:");
		Bank b3 = new  HDFC();
		b3.rateOfInterest();
		b3.withDraw();
		b3.transfer();
		
		System.out.println("------------");
		System.out.println("ICICI Details are:");
		Bank b4 = new ICICI();
		b4.rateOfInterest();
		b4.withDraw();
		b4.transfer();

	}

}

