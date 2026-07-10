package com.practice;

public class ConstructorOverloading {
    int age;
    String name;
    ConstructorOverloading(){
        name="unknown";
        age=0;
    }
    ConstructorOverloading(String n){
        name =n;
        age=0;
    }
    ConstructorOverloading(String n,int a){
        name=n;
        age=a;
    }
    void display(){
        System.out.println("name :" +name + "age :" +age);
    }

    static void main() {
        ConstructorOverloading obj=new ConstructorOverloading();
        ConstructorOverloading obj1=new ConstructorOverloading("farooq");
        ConstructorOverloading obj2=new ConstructorOverloading("farooq",29);
        obj.display();
        obj1.display();
        obj2.display();
    }

}
