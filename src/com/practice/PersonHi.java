package com.practice;

 class PersonHi {
     public void walking(){
         System.out.println("person walking");
     }

}
class Student1 extends PersonHi{
     public void passed(){
         System.out.println("Stuent passed");
     }

}
class Employee extends PersonHi{
     public void working(){
         System.out.println("Employee is working");
     }
}
class PersonH{
    static void main() {
        Student1 obj=new Student1();
        Employee obj1=new Employee();
        obj.walking();
        obj.passed();
        obj1.working();

    }
}
