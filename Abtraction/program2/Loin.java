package Abtraction.program2;

public class Loin extends Animal{
     String breed;
     
     Loin(String type,String breed){
    	 super(type);
    	 this.breed=breed;
     }
     
     @Override
     void speak() {
    	 System.out.println("Lion is raoring");
     }
     
     @Override 
     void eat() {
    	 System.out.println("lion is eating");
     }
}
