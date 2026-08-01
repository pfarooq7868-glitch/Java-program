package Inheritance;

public class Account {
    public String AccountHolder;
      double balance;
      Account(String AccountHolder,double balance){
          this.AccountHolder=AccountHolder;
          this.balance=balance;

      }
    void printAccount(){
        System.out.println("Account:"+AccountHolder);
        System.out.println("Balance:"+balance);
    }

}
