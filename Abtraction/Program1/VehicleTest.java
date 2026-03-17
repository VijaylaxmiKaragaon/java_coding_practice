package Abtraction;

public class VehicleTest {
    public static void main(String args[]){
        Car c = new Car("BMW", 2000);
        c.start();
        System.out.println(c.brand);
        System.out.println(c.price);
        Bike b = new Bike("Royal Enfield", 5000);
        b.start();
         System.out.println(c.brand);
        System.out.println(c.price);
    }
}
