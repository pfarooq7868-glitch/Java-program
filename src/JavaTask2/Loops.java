package JavaTask2;

public class Loops {
    public static void main(String[]args){
        int num=10;
        if(num>=10) {
            System.out.println("postive number :" +num);
        }else{
            System.out.println("negative number");
        }
        int num1=12;
        if(num1%2==0) {
            System.out.println("Even Number :" +num1);
        }else{
            System.out.println("Negative Number");
        }
        int age=18;
        if(age>=18) {
            System.out.println("Eligible to vote :" +age);
        }else{
            System.out.println("Not eligible to vote");
        }
        int marks=90;
        if(marks>=85) {
            System.out.println("Grade A");
        }else if(marks>=80) {
            System.out.println("Grade B");
        }else if(marks>=70) {
            System.out.println("Grade c");
        }else if(marks>=60) {
            System.out.println("Grade D");
        }else{
            System.out.println("Grade F");
        }
        int num2=30;
        int num3=40;
        if(num2>num3) {
            System.out.println(num2 + " is the largest number");
        }else{
            System.out.println(num3 +"is the largest number");
        }
        for(int i=1;i<=10;i++){
            System.out.println(i);


        }
        String name="farooq";
        String reverse="";
        for(int i=name.length()-1;i>=0;i--){
            reverse=reverse+name.charAt(i);

        }
        System.out.println("original string :"+name);
        System.out.println("Reversed string :"+reverse);
        int table=12;
        for(int i=1;i<=10;i++){
            System.out.println(table+"x"+i+"="+(table*i));
        }
        int n=10;
        int sum=0;
        for(int i=1;i<=n;i++){
            sum=sum+i;
        }
        System.out.println("sum of first N natural numbers =" +sum);
        int count=0;
        for(int i=1;i<=10;i++){
            if(i%2!=0){
                System.out.println(i);
                count++;
            }
        }
        for(int i=10;i>=1;i--) {
            System.out.println(i);
        }
        int num4=10;
        int factorial=1;
        for(int i=1;i<=num4;i++){
            factorial=factorial*i;
        }
        System.out.println("factorial of"+ num4+ "=" +factorial);
        int base=10;
        int exponent=5;
        int result=1;
        for(int i=1;i<=exponent;i++){
            result=result*base;
        }
        System.out.println(base +"power"+exponent+"="+result);
        int num5=121;
        int original=num5;
        int reverse1=0;
        for(;num5!=0;num5=num5/10){
            int digit=num5%10;
            reverse1=reverse1*10+digit;
        }
        if(original==reverse1) {
            System.out.println(original + "is a palindrome Number");
        }else{
            System.out.println(original + "is not a palindrome Number");
        }
        int num6=25;
        if(num6%5==0) {
            System.out.println(num6 + "is divisible by 5");
        }else{
            System.out.println(num6+"is not divisble by 5");
        }
        String username="farooq7868";
        String password="abcdgf";
        if(username=="farooq7868"&&password=="abcdgf") {
            System.out.println("Login successful");
        }else{
            System.out.println("Login failed");
        }
        int sum1=0;
        for(int i=1;i<=10;i++){
            if(i%2==0){
                sum1=sum1+i;

            }
        }
        System.out.println("sum of even numbers ="+sum);
        int num7=16;
        int num8=18;
        int max;
        if(num7>num8) {
            max = num7;
        }else{
            max=num8;
        }
        for(int i=max; ;i++){
            if(i%num7==0&&i%num8==0){
                System.out.println("LCM ="+i);
                break;
            }
        }

    }
}
