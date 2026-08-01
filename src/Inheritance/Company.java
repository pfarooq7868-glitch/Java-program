package Inheritance;

public class Company {
    private  String companyName;
    protected String location;
    Company(String companyName,String location){
        this.companyName=companyName;
        this.location=location;

    }
    void showcompanyonfo(){
        System.out.println("Company Name :" +companyName);
        System.out.println("Location:" +location);
    }
}
