package Casting;

 class Employee {
     void work(){
         System.out.println("Employee is working");
     }
}
class Manager extends Employee{
     @Override
    void work(){
         System.out.println("Manager approved leave");
     }
}
class Developer extends Employee{
     @Override
    void work(){
         System.out.println("Developer writing code");
     }

}
class Employeeemain{
     public static void main(String[]args){
         Employee e1=new Manager();
         Employee e2=new Developer();
         e1.work();
         e2.work();
     }
}


