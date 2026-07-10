package com.practice;

 class Device {
     public void working(){
         System.out.println("Device working");
     }
}
class Mobile extends Device{
     public void nothing(){
         System.out.println("Nothing Mobile");
     }
}
class DeviceTest{
    static void main() {
        Mobile obj=new Mobile();
        obj.working();
        obj.nothing();

    }
}
