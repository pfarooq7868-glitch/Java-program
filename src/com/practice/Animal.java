package com.practice;

 class Animal {
     public void eating(){
         System.out.println("Animal is eating");
     }
}
class Dog extends Animal{
     public void barking(){
         System.out.println("Dog is barking");
     }
}
class AnimalTest{
    static void main() {
        Dog obj=new Dog();
        obj.eating();
        obj.barking();
    }
}
