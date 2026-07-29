public class Practice2 {
    public static void main(String[]args){
        int num=6;
        int fac=1;
        for(int i=1;i<=num;i++){
            fac=fac *i;
        }
        System.out.println(fac);
        int num1=20;
        int fact=1;
        for(int i=1;i<=num1;i++){
            fact=fact*i;
        }
        System.out.println("Factorial of 20 :"+fact);
        int num2=54321;
        int rev=0;
        while(num2!=0){
            int rem=num2%10;
            rev=rev*10+rem;
            num2=num2/10;
        }
        System.out.println(rev);
        int a=20;
        int b=65;
        int sum=a+b;
        System.out.println("Sum =" +sum);

    }
}
