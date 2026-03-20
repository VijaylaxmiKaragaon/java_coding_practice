package Abtraction.Assignment;

public abstract class Bank {
    String name;
    
    Bank(String name){
    	this.name=name;
    }
    
    abstract void login();
}
