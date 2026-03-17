package Abtraction.Program1;

public class Bike extends Vehicle {
    double price;
    Bike(String brand,double price){
        super(brand);
        this.price=price;
    }
    void start(){
        System.out.println("Bike start by kick");
    }
}
