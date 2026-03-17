package Abtraction.program2;

public class Dog extends Animal{
     String breed;
     
     Dog(String type,String breed){
    	 super(type);
     }
     
     @Override
     void speak() {
    	 System.out.println("Dog barks");
     }
     
     @Override
     void eat() {
    	 System.out.println("Dog is eating");
     }
}
