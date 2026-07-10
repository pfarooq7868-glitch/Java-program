package com.practice;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;


public class Set {
    public static void main(String[] args) {
        HashSet<Integer> employeeid=new HashSet<>();
        employeeid.add(101);
        employeeid.add(102);
        employeeid.add(101);
        employeeid.add(104);
        for(int emp:employeeid){
            System.out.println(emp);
            if(employeeid.add(102)) {
                System.out.println("employee id added");
            }else{
                System.out.println("Duplicate employee id not allowed");
            }

        }
        HashSet<String> emailid=new HashSet<>();
        emailid.add("pfarooq7868@gmail.com");
        emailid.add("fazilkhan@gmail.com");
        emailid.add("pathan@gmail.com");
        String newEmail="pathan@gmail.com";
        if(emailid.contains(newEmail)) {
            System.out.println("Email is already registered");
        }else{
            emailid.add(newEmail);
            System.out.println("Email registered successfully");
            System.out.println(emailid);

        }
        LinkedHashSet<Integer> id=new LinkedHashSet<>();
        id.add(123);
        id.add(124);
        id.add(125);
        id.add(124);
        id.add(126);
        for(int pid:id){
            System.out.println(pid);
        }
        LinkedHashSet<String> names=new LinkedHashSet<>();
        names.add("Farooq");
        names.add("fazil");
        names.add("salma");
        names.add("nuha");
        System.out.println("Enrolled Students :");
        for(String Enrolled:names){
            System.out.println(Enrolled);
        }
        TreeSet<String> books=new TreeSet();
        books.add("java");
        books.add("python");
        books.add("selenium");
        books.add("playwright");
        books.add("java");
        System.out.println("Book titles:");
        for(String book:books){
            System.out.println(book);
        }
        TreeSet<Integer> scores=new TreeSet();
        scores.add(200);
        scores.add(234);
        scores.add(100);
        scores.add(250);
        for(int score:scores){
            System.out.println(score);
        }
        System.out.println("Highest score :"+ scores.last());
        System.out.println("lowest score :" +scores.first());















        }

}
