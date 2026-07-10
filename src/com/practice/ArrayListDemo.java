package com.practice;
import java.util.ArrayList;
import java.util.LinkedList;




public class ArrayListDemo {
    static void main() {
        ArrayList<String> name=new ArrayList();
        name.add("Farooq");
        name.add("Fazil");
        name.add("salma");
        name.add("nubha");
        name.add("nuha");
        System.out.println(name);
        System.out.println(name.size());
        System.out.println(name.get(0));
        System.out.println(name.get(4));
        System.out.println(name.remove(2));
        System.out.println(name);
        System.out.println(name.set(1,"rahul"));
        System.out.println(name);
        System.out.println(name.contains("Farooq"));


        ArrayList<Integer> num=new ArrayList();
        num.add(10);
        num.add(20);
        num.add(30);
        num.add(40);
        num.add(50);
        int largest=num.get(0);
        for(int i=1;i<num.size();i++){
            if(num.get(i)>largest){
                largest=num.get(i);
            }
        }
        System.out.println("largest number :" + largest);





        LinkedList<Integer>list=new LinkedList();
        list.add(2);
        list.add(4);
        list.add(6);
        list.add(8);
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.get(2));

    }
}
