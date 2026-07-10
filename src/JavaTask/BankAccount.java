package JavaTask;

public class BankAccount {
    long accountNumber;
    String accountHolder;
    String bankName;
    String branchName;
    int balance;
    BankAccount(long accNumber,String holderName,String banName,String branName,int bal){
        accountNumber=accNumber;
        accountHolder=holderName;
        bankName=banName;
        branchName=branName;
        balance=bal;
        System.out.println("accountNumber :" +accountNumber);
        System.out.println("accountHolder :" +accountHolder);
        System.out.println("bankName :" +bankName);
        System.out.println("branchName :" +branchName);
        System.out.println("balance:" +balance);
        System.out.println("-------------------------------");





    }

    static void main() {
        new BankAccount(123443244L,"Farooq Khan","Icici","besant Nagar",200000);
        new BankAccount(1234434244L,"Fazil Khan","SBI","Nellore",100000);
        new BankAccount(133443244L,"salma Khan","HDFC","chennai",240000);


    }

}
