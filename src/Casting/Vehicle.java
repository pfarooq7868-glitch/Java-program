package Casting;

 class Vehicle {
    void move() {
        System.out.println("vehicle is moving");
    }
    }
     class Car extends Vehicle{
        @Override
        void move(){
            System.out.println("Car is moving");
        }
    }
     class Bike extends Vehicle{
        @Override
        void move(){
            System.out.println("Bike is moving");

        }
    }
     class Main{
        public static void main(String[]args){
            Vehicle V1=new Car();
            Vehicle V2=new Bike();
            V1.move();
            V2.move();
        }
    }


