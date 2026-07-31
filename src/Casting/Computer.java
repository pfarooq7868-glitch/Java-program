package Casting;

 class Computer {
     void computing(){
         System.out.println("Computer is computing");
     }
}
class Desktop extends Computer{
     @Override
    void computing(){
         System.out.println("Desktop is computing");
     }
     void gaming(){
         System.out.println("Desktop is used for gaming");
     }
}
class Laptop extends Computer{
     @Override
    void computing(){
         System.out.println("Laptop is computing");
     }
}
class Computermain{
     public static void main(String[]args){
         Computer c=new Desktop();
         c.computing();
         Desktop d=(Desktop) c;
         d.gaming();

     }
}
