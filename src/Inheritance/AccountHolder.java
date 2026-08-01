package Inheritance;

public class AccountHolder extends Bank {
    String accountName;
    void displayAccountHolder(){
        System.out.println("Branch code:"+branchCode);
        System.out.println("Account name:"+accountName);
    }
}
