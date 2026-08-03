package Polymorphism;

public class Sum {
    void add(int a,int b){
        System.out.println("Integer sum="+(a+b));
    }
    void add(double a,double b){
        System.out.println("Double sum="+(a+b));
    }
    void add(int a,double b){
        System.out.println("Mixed sum="+(a+b));
    }
    public static void main(String[]args){
        Sum s=new Sum();
        s.add(10,20);
        s.add(20.0,40.0);
        s.add(10,65.5);
    }
}
