package JavaLangPackage.program1;

public class Customer {
    int customerId;
    String name;
    Customer(int customerId,String name){
    	this.customerId=customerId;
    	this.name=name;
    }
    @Override
    public boolean equals(Object obj) {
    	if(obj instanceof Customer) {
    		Customer c = (Customer)obj;
    		return this.customerId == c.customerId && this.name.equals(c.name);
    	}
    	return false;
    }
}
