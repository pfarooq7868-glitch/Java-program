package Inheritance;

public class CustomerAccount extends Account{
    String customerId;
    CustomerAccount(String AccountHolder, double balance,String customerId) {
        super(AccountHolder, balance);
        this.customerId=customerId;
    }
    void printCustomerDetails(){
        printAccount();
        System.out.println("CustomerID:"+customerId);
    }
    public static void main(String[]args){
        CustomerAccount c=new CustomerAccount("Farooq Khan",80000,"C1011");
        c.printCustomerDetails();
    }
}
