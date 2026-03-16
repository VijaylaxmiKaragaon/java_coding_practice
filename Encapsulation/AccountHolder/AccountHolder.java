package Encapsulation.AccountHolder;

public class AccountHolder {
     private String name;
    private int accountNumber;
    private double balance;
    
    public void setName(String name) {
    	this.name=name;
    	}
    public String getName() {
    	return name;
    }
    public void setAccountNumber(int accountNumber) {
    	this.accountNumber=accountNumber;
    }
    public int getAccountNumber() {
    	return accountNumber;
    }
    public void setBalance(double balance) {
    	this.balance=balance;
    }
    public double getBalance() {
    	return balance;
    }
}
