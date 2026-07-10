

public class Practice1 {

public static double method1 (int i,char a){
    return i+a;
}
public static int method2 (float f,double d){
    return(int)(f+d);
}
public static boolean method3(char ch1,char ch2){
    return ch1!=ch2;
}
public static String method4(long l,int i,float f){
    return "Farooq Khan";
}
public static long method5(int i,int a,int b){
    return i+a+b;

}
public static float method6(String q,int s){
    return s*1.5f;
}
public static short method7(double d,char ch3,boolean t){
    return (short)d;
}
public static int method8(long l,long m){
    return (int)(l+m);
}
public static boolean method9(float f, String  a){
    return f>10;
}
public static String method10(char ch1,char ch2,char ch3){
    return "" +ch1+ch2+ch3;
}
public static char method11(int i,long l,double d){
    return 'A';
}
public static double method12(float f,float g){
    return f+g;
}
public static long method13(boolean t, String a,char ch1){
    return 5000L;
}
public static boolean method14(int i,int j,int k,int l){
    return i+j==k+l;
}
public static short method15(double d,float f,long l){
    return (short)(d+f+l);
}
public static boolean method16(String a,String b,int i){
    return a.length()+b.length()==i;
}
public static double method17(char ch1,float f,boolean t){
    return ch1+f;
}
public static String method18(long l,long m,double d){
    return "Value :"+l+","+m+","+d;
}
public static float method19(int i,char ch1,char ch2,boolean t) {
    return i + ch1 + ch2;

}
public static long method20(int i,int j,float f, double d){
    return (long)(i+j+f+d);
}
public static char method21(String a, String b, String c){
    return a.charAt(1);
}
public static double method22(boolean t,int i,double d){
    return i+d;
}
public static boolean method23(char ch1,char ch2,String s1,float f){
    return ch1==ch2;

}
public static int method24(long l,double d,boolean t, char ch1){
    return (int)(l+d+ch1);
}
public static String method25(int i,int j,int k,int l){
    return"Values ="+" "+i+" "+j+" "+k+" "+l;
}
public static char method26(float f, double d,String s1){
    return s1.charAt(2);
}
public static long method27(boolean t,boolean f,int i,int j){
    return i+j;
}
public static float method28(char ch1,String a,long l){
    return ch1+l;
}
public static String method29(int i,float f, double d,long l, boolean t){
    return "sum="+(i+f+d+l);

}








    static void main() {
    double result=method1(10, 'A');
        System.out.println(result);
        int result1=method2(10.5F,23);
        System.out.println(result1);
        boolean result2=method3('A','A');
        System.out.println(result2);
        String result3=method4(1000L,10,23.5F);
        System.out.println(result3);
        long result4=method5(10,60,45);
        System.out.println(result4);
        float result5=method6("Farooq Khan",10);
        System.out.println(result5);
        short result6=method7(22,'c',true);
        System.out.println(result6);
        int result7=method8(1000L,5000L);
        System.out.println(result7);
        boolean result8=method9(23.3F,"Farooq");
        System.out.println(result8);
        String result9=method10('A','B','C');
        System.out.println(result9);
        char result10=method11(10,1000L,23);
        System.out.println(result10);
        double result11=method12(45.6F,12.8F);
        System.out.println(result11);
        long result12=method13(true,"farooq",'A');
        System.out.println(result12);
        boolean result13=method14(10,20,15,15);
        System.out.println(result13);
        short result14=method15(23,46.5F,25000L);
        System.out.println(result14);
        boolean result15=method16("Farooq","Pathan",12);
        System.out.println(result15);
        double result16=method17('A',23.6F,true);
        System.out.println(result16);
        String result17=method18(1000L,29000L,45);
        System.out.println(result17);
        float result18=method19(10,'A','B',true);
        System.out.println(result18);
        long result19=method20(10,20,42.5F,26);
        System.out.println(result19);
        char result20=method21("Farooq","Khan","Pathan");
        System.out.println(result20);
        double result21=method22(true,34,45.6);
        System.out.println(result21);
        boolean result22=method23('A','B',"Farooq",23.7F);
        System.out.println(result22);
        int result23=method24(1000L,25,true,'A');
        System.out.println(result23);
        String result24=method25(10,20,20,40);
        System.out.println(result24);
        char result25=method26(23.2F,22,"Farooq");
        System.out.println(result25);
        long result26=method27(true,true,10,40);
        System.out.println(result26);
        float result27=method28('C',"FAROOQ",1000L);
        System.out.println(result27);
        String result28=method29(10,23.2F,22,1500L,true);
        System.out.println(result28);


    }
}
