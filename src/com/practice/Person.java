package com.practice;

 class Person {
     public void iswalking(){
         System.out.println("person is walking");
     }

}
class Student extends Person{
     public void gotpass(){
         System.out.println("Student got pass");
     }
}
class PersonTest{
     public static void main(String[] args){
         Student obj=new Student();
         obj.iswalking();
         obj.gotpass();

     }
}
