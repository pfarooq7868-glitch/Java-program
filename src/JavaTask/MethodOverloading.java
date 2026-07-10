package JavaTask;
/**//*Apply discount:



Percentage discount

Percentage discount with coupon discount

Method Overloading – Employee Salary*/

public class MethodOverloading {


    public void  discount(double amount,double percent){
        double finalamount=amount-(amount*percent/100);
        System.out.println("final amount:" + finalamount);
    }


    public void  discount(double amount,double percent,double coupon) {
        double finalamount = amount - (amount * percent / 100) - coupon;
        System.out.println("final amount:" + finalamount);
    }

    public  static void main(String[]args){

        MethodOverloading obj=new MethodOverloading();
        obj.discount(10000,12);
        obj.discount(10000,12,500);




    }



    }
