package ExceptionHandling;

public class Calculator {
    public static void main(String[]args){
        try{
            int num1=20;
            int num2=10;
            System.out.println("Addition ="+(num1+num2));
            System.out.println("Subtraction ="+(num1+num2));
            System.out.println("Multiplication ="+(num1*num2));
            System.out.println("Division ="+(num1/num2));
        }catch(ArithmeticException e) {
            System.out.println("Error Division zero is not allowed");
        }catch(Exception e) {
            System.out.println("Invalid input");
        }finally {
            System.out.println("Program Ended");

        }
    }
}
