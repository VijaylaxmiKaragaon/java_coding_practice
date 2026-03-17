package Abtraction;

abstract class Vehicle {
    String brand;
    abstract void start();
    void stop(){
        System.out.println("Vehicle stopped");
    }
    public Vehicle(String brand){
        this.brand=brand;
    }
}
