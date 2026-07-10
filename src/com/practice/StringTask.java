package com.practice;

public class StringTask {
    void even() {
        int a = 30;
        if (2 % 2 == 0) {
            System.out.println("even number");
        } else {
            System.out.println("odd number");
        }
    }
    void largest(){
        int a=10;
        int b=20;
        if(a>b) {
            System.out.println("largest number");
        }else{
            System.out.println("smallest number");
        }
    }
    void positive(){
        int num=-7;
        if(num>0) {
            System.out.println("positive number");
        }else{
            System.out.println("negative number");
        }
    }



    public static void main(String[] args) {
        System.out.println("Farooq Khan");
        StringTask obj = new StringTask();
        obj.even();
        StringTask obj1=new StringTask();
        obj1.largest();
        StringTask obj2=new StringTask();
        obj2.positive();
    }
}

