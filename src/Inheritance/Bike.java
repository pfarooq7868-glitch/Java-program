package Inheritance;

public class Bike extends Vehicle {
    Bike(int speed,int fuel){
        this.speed=speed;
        this.fuel=fuel;
    }
    void displayBikestatus(){
        showstatus();
    }
    public static void main(String[]args){
        Bike b=new Bike(80,10);
        b.displayBikestatus();
    }
}
