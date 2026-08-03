package Polymorphism;

public class Vehicle {
    void move(){
        System.out.println("Vehicle Moving");
    }
}
class Car extends Vehicle{
    @Override
    void move(){
        System.out.println("Car moving on 4 wheels");
    }
}
class Bike extends Vehicle{
    @Override
    void move(){
        System.out.println("Bike moving on 2 wheels");
    }
}
class Boat extends Vehicle{
    @Override
    void move(){
        System.out.println("Boat moving on water");
    }
}
class VehicleMain{
    public static void main(String[]argsa){
        Vehicle v;
        v=new Car();
        v.move();
        v=new Bike();
        v.move();
        v=new Boat();
        v.move();
    }

}
