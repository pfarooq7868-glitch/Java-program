package Polymorphism;

public class Temperature {
    void convert(double celsius){
        System.out.println("Fahrenheit="+((celsius*9/5)+32));
    }
    void convert(double celsius,int k){
        System.out.println("Kelvin="+(celsius+273.15));
    }
    public static void main(String[]args){
        Temperature t=new Temperature();
        t.convert(30.0);
        t.convert(20,1);
    }
}
