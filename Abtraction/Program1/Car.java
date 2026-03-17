package Abtraction.Program1;

public class Car extends Vehicle {
    double price;
    Car(String brand,double price){
        super(brand);
        this.price=price;
    }
    @Override
    void start(){
        System.out.println("Car starts by using key");
    }
}
