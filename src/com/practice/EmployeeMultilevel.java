package com.practice;

 class EmployeeMultilevel {
     public void working(){
         System.out.println("Employee is working");
     }

}
class Developer extends EmployeeMultilevel{
     public void coding(){
         System.out.println("Developer is coding");
     }
}
class SeniorDeveloper extends Developer{
     public void revewing(){
         System.out.println("senior developer revewing code");
     }
}
class Employee1{
    static void main() {
        SeniorDeveloper obj=new SeniorDeveloper();
                obj.working();
                 obj.coding();
                 obj.revewing();

    }
}
