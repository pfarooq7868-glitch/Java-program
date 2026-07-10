package JavaTask;

public class Customer {
    int customerID;
    String customerName;
    long mobileNumber;
    String cityName;
    String emailID;
    Customer(int ID,String custName,long mobNumber,String cN,String emlID){
        customerID=ID;
        customerName=custName;
        mobileNumber=mobNumber;
        cityName=cN;
        emailID=emlID;
        System.out.println("customer ID :" + customerID);
        System.out.println("customer Name :" + customerName);
        System.out.println("mobile Number  :" + mobileNumber);
        System.out.println("city Name  :" + cityName);
        System.out.println("emailID :" + emailID);
        System.out.println("----------------------------------");



    }

    static void main() {
        new Customer(14672,"Farooq",8688053960L,"Hyderabad","pfarooq7868@gmail.com");
        new Customer(14673,"Fazil",8688053450L,"Nellore","pfazil7868@gmail.com");
        new Customer(14674,"Nuha",8688043960L,"chennai","pnuha7868@gmail.com");
        new Customer(14675,"Ibrah",8688063960L,"Hyderabad","pibrah7868@gmail.com");



    }
}
