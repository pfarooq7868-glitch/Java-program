package com.practice;

public class EmployeeConstructorOverloading {
    int salary;
    String EmployeeName;

    EmployeeConstructorOverloading() {
        EmployeeName = "unknown";
        salary = 0;

    }

    EmployeeConstructorOverloading(String n) {
        EmployeeName = n;
        salary = 0;
    }

    EmployeeConstructorOverloading(String n, int a) {
        EmployeeName = n;
        salary = a;

    }

    void display() {
        System.out.println("Employee name :" + EmployeeName + "salary :" + salary);
    }

    static void main() {
        EmployeeConstructorOverloading obj = new EmployeeConstructorOverloading();
        EmployeeConstructorOverloading obj1 = new EmployeeConstructorOverloading("farooq khan");
        EmployeeConstructorOverloading obj2 = new EmployeeConstructorOverloading("Farooq Khan", 80000);
        obj.display();
        obj1.display();
        obj2.display();
    }

}

