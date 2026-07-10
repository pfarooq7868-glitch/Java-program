package com.practice;

public class TaskPractice {
    public static void main(String[] args){
        int num=12;
        if(num%2==0) {
            System.out.println("even number");
        }else{
            System.out.println("odd number");

            }
        for(int i=0;i<=100;i++){
            System.out.println(i);
        }
        System.out.println("-------------------------------");
        for(int i=1;i<=50;i++){
            if(i%2==0){
                System.out.println(i);
            }

        }
        int sum=0;
        for(int i=1;i<=100;i++){
            sum=sum+i;
        }
        System.out.println("sum =" +sum);
        String name="Farooq";
        String reverse="";
        for(int i=name.length()-1;i>=0;i--){
            reverse=reverse+name.charAt(i);
        }
        System.out.println("original name :" +name);
        System.out.println("Revesed name :" +reverse);
        int[]arr={10,20,30,40,50};
        int largest=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        System.out.println("Largest =" +largest);
        int[]arr1={10,20,30,40,50};
        int smallest=arr[0];
        for(int i=0;i<arr.length;i++){
            if (arr[i]<smallest){

            }
        }
        System.out.println("Smallest =" +smallest);
        int[]arr2={10,20,30,40,50};
        int sum1=0;
        for(int i=0;i<arr.length;i++){
            sum1=sum1+arr[i];

        }
        System.out.println("sum =" +sum1);
        int[]arr3={10,20,30,40,50};
        for(int i=arr3.length -1;i>=0;i--){
            System.out.println(arr3[i]);

        }
        int[]arr4={10,20,30};
        int sum3=0;
        for(int i=0;i<arr4.length;i++){
            sum3=sum3+arr4[i];


        }
        System.out.println("sum =" +sum3);
        String name1="Farooq";
        int count=0;
        for(int i=0;i<name1.length();i++){
            char ch= Character.toLowerCase(name1.charAt(i));
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o'|| ch=='u'){
                count++;
            }
        }
        System.out.println("Number of vowels =" + count);
        String name2="noon";
        String reverse1="";
        for(int i=name2.length()-1;i>=0;i--){
            reverse1=reverse1+name2.charAt(i);
        }
        if(name2.equals(reverse1)) {
            System.out.println("palindrome");
        }else{
            System.out.println("Not palindrome");
        }
        String name4="Farooq";
        System.out.println(name4.length());
        System.out.println(name4.charAt(5));
        System.out.println(name4.equals("Farooq"));
        System.out.println(name4.toUpperCase());
        System.out.println(name4.isEmpty());
        System.out.println(name4.contains("Farooq"));














    }

    }

