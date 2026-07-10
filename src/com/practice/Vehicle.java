package com.practice;

 class Vehicle {
     public void loading(){
         System.out.println("vehicle loading");
     }
}
class car extends Vehicle{
     public void stops(){
         System.out.println("car stops");
     }

}
class main{
    static void main() {
        car obj=new car();
        obj.loading();
        obj.stops();
    }

}
