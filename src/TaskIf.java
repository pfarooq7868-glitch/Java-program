import java.sql.SQLOutput;
import java.util.Locale;

public class TaskIf {
    public static void main(String[] args) {
        int num = 12;
        if (num >= 10) {
            System.out.println(num + "is postive number");
        } else {
            System.out.println(num + "is negative number");
        }
        int num1 = 10;
        if (num1 % 2 == 0) {
            System.out.println(num1 + "is even number");
        } else {
            System.out.println(num1 + "is odd number");
        }
        int num3 = 30;
        int num4 = 65;
        if (num3 > num4) {
            System.out.println(num3 + "is smallest number");
        } else {
            System.out.println(num4 + "is largest number");
        }
        int age = 18;
        if (age >= 18) {
            System.out.println("elegible to vote");
        } else {
            System.out.println("not elegible to vote");
        }
        int num6 = 15;
        for (int i = 1; i <= 15; i++) {
            System.out.println(num6 + "x" + i + "=" + (num6 * 1));
        }
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
        int num7 = 25;
        if (num7 % 5 == 0) {
            System.out.println(num7 + "is divisible by5");
        } else {
            System.out.println(num7 + "is not divisible by5");
        }
        String username ="farooq7868";
        String password ="farooq@7868";
        if(username.equals("farooq7868")&&password.equals("farooq@7868")) {
            System.out.println("login successful");
        }else {
            System.out.println("login failed");
        }
        int sum=0;
        for(int i=1;i<=10;i++) {
            if (i % 2 == 0) {
                sum = sum + i;
            }
        }
        System.out.println("sum of even numbers="+sum);
        String name ="farooq khan";
        System.out.println("name :"+name.concat(" pathan"));
        System.out.println("name :"+name.length());
        System.out.println("name :"+name.toUpperCase());
        System.out.println("name :"+name.charAt(0));
        System.out.println(name.replace('f','P'));
        System.out.println(name.replaceAll("farooq","pathan"));
        System.out.println(name.replaceAll(" ",""));

            }
        }























