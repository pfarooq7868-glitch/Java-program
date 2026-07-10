package com.practice;

 class Bank {
    public void holiday(){
        System.out.println("Bank holiday");
    }
}
class Sbi extends Bank{
     public void savingAccount(){
         System.out.println("Sbi savingAccount");
     }
}
class Main{
    static void main() {
        Sbi obj=new Sbi();
        obj.holiday();
        obj.savingAccount();
    }
}
