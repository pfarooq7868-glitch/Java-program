package com.practice;

 class EmployeOverriding {
     public void work(){
         System.out.println("work");
     }

}
class Tester extends EmployeOverriding {
    @Override
    public void work() {
        System.out.println("tester is working on application");

    }
}
class Developer1 extends EmployeOverriding {
    @Override
    public void work() {
        System.out.println("developer is working on code");

    }
}
class Manager extends EmployeOverriding {
    @Override
    public void work() {
        System.out.println("Manager is working on approval");
    }
}
class main1{
    static void main() {
        EmployeOverriding obj=new Developer1();
        obj.work();
        EmployeOverriding obj1=new Tester();
        obj1.work();
        EmployeOverriding obj2=new Manager ();
        obj2.work();




    }
}