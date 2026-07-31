package Casting;

 class Instrument {
     void play(){
         System.out.println("Instrument play");
     }
}
class Guitar extends Instrument{
     @Override
    void play(){
         System.out.println("Guitar play");
     }
     void tune(){
         System.out.println("Guitar tuned");
     }
}
class piano extends Instrument{
     @Override
    void play(){
         System.out.println("piano play");
     }
}
class Instrumentmain{
     public static void main(String[]args){
         Instrument I=new Guitar();
         I.play();
         Guitar g=(Guitar)I;
         g.tune();
     }
}
