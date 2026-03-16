package Encapsulation.AccountHolder;

public class AccountHolderTest {
    public static void main(String[] args) {
		AccountHolder ac = new AccountHolder();
		ac.setName("Sanjay");
        System.out.println(ac.getName());
        ac.setBalance(50000);
        System.out.println(ac.getBalance());
        ac.setAccountNumber(123456789);
        System.out.println(ac.getAccountNumber());
	}
}
