package JavaTask;
import java.util.Scanner;
public class ScannerTask {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length value :");
        int length=sc.nextInt();
        System.out.println("Enter breadth value :");
        int breadth= sc.nextInt();
        int area= length*breadth;
        System.out.println("Area of rectangle ="+area);
    }




}
