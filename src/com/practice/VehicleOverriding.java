package com.practice;

 class VehicleOverriding {
    public void Start(){
        System.out.println("Starts");
    }
}
class Car extends VehicleOverriding {
    @Override
    public void Start() {
        System.out.println(" car Starts");

    }
}
class Bike extends VehicleOverriding {
    @Override
    public void Start() {
        System.out.println(" Bike Starts");

    }
}
class Bus extends VehicleOverriding {
    @Override
    public void Start() {
        System.out.println(" Bus Starts");

    }
}
class Main1{
    static void main() {
        VehicleOverriding obj=new Car();
        obj.Start();
        VehicleOverriding obj1=new Bus();
        obj1.Start();
        VehicleOverriding obj2=new Bike();
        obj2.Start();





    }
}


