package Casting;

 class Device {
     void trunOn(){
         System.out.println("Device trunOn");
     }

     }
     class smartphone extends Device {
         @Override
         void trunOn() {
             System.out.println("smart phone truning on");
         }

         void call() {
             System.out.println("Making a phone call");
         }
     }
     class laptop extends Device{
     @Override
         void trunOn(){
         System.out.println("laptop truning on");
     }
     }
     class main{
     public static void main(String[]args){
         Device d1=new smartphone();
         d1.trunOn();
         smartphone s= (smartphone)d1;
         s.call();
     }
     }

