package com.practice;

public class Array {
    public static void main(String[] args) {
        int[] arr={10,40,60,23,};
        for(int i=0;i< arr.length;i++){
            System.out.println(arr[i]);
        }
        int[] arr1={10,30,40,60};
        int sum=0;
        for(int i=0;i< arr1.length;i++){
            sum=sum+arr1[i];
        }
        System.out.println("sum =" + sum);
        int[] arr2={10,25,45,65};
        int max=arr2[0];
        for(int i=0;i< arr2.length;i++){
            if (arr2[i]>max){
                max=arr2[i];
            }
        }
        System.out.println("largest ="+max);
        int[]arr3={10,40,33,32};
        int min=arr3[0];
        for(int i=0;i<arr3.length;i++){
            if(arr3[i]<min){
                min=arr3[i];
            }
        }
        System.out.println("smallest number :" +min);

        int[][]arr4={{1,2},{3,4}};
        int add=0;
        for(int i=0;i<arr4.length;i++){
            for(int j=0;j<arr4[i].length;j++){
                add=add+arr4[i][j];

            }
        }
        System.out.println("sum :" + add);
        int[][]arr5= {{1, 2}, {3, 4}, {5, 6}};
        int sum1=0;
                for(int i=0;i<arr5.length;i++){
                    for(int j=0;j<arr5[i].length;j++){
                        sum1+=arr5[i][j];
                    }
                }
        System.out.println("sum : " +sum1);






    }

}
