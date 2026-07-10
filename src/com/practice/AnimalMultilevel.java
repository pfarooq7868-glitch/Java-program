package com.practice;

 class AnimalMultilevel {
     public void eating(){
         System.out.println("Animal is eating");
     }

}
class dog extends AnimalMultilevel{
     public void barking(){
         System.out.println("dog barking");
     }
}
class puppy extends dog{
     public void playing(){
         System.out.println("puppy playing");
     }
}
class Animal1{
    static void main() {
        puppy obj=new puppy();
        obj.eating();
        obj.barking();
        obj.playing();

    }
}
