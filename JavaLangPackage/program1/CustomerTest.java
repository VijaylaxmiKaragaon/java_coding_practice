package JavaLangPackage.program1;

public class CustomerTest {
    public static void main(String[] args) {
		Customer c1 = new Customer(101,"Vijaylaxmi");
		Customer c2 = new Customer(101,"Vijaylaxmi");
		Customer c3 = new Customer(103,"Sanjay");
		System.out.println(c1==c2); //false
		System.out.println(c1==c3); //false
		System.out.println(c1.equals(c2)); //true

	}
}
