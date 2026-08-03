package Taskoperators;

public class LogicalOperators {
    public static void main(String[] args) {
        int age = 18;
        int marks = 40;
        System.out.println(age>=18&&marks>35);
        int number=25;
        System.out.println(number>10&&number<50);
        boolean idCard=true;
        boolean hallTicket=true;
        System.out.println(idCard&&hallTicket);
        int num1=10;
        System.out.println(num1%2==0&&num1%5==0);
        boolean student=false;
        boolean teacher=true;
        System.out.println(student||teacher);
        String username="Farooq@7868";
        String Password="abcdeg";
        System.out.println(username.equals("Farooq@7868")&&Password.equals("abcdeg"));
        String day="sunday";
        System.out.println(day.equals("Saturday")||day.equals("sunday"));
        int num2=8;
        System.out.println(num2>0&&num2%2==0);
        boolean condition=true;
        System.out.println(!condition);
        boolean Ticket=false;
        boolean Pass=true;
        System.out.println(Ticket||Pass);
    }
}
