package Abtraction.program2;

public abstract class Animal {
      String type;
      
      Animal(String type){
    	  this.type=type;
      }
      
      abstract void speak();
      abstract void eat();
}
