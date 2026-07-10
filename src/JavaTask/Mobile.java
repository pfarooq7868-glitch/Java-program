package JavaTask;

public class Mobile {

    int mobileID;
    String brandName;
    String modelName;
    int ram;
    int price;

    Mobile(int ID,String bN, String mN,int memory,int p){
        mobileID=ID;
        brandName=bN;
        modelName=mN;
        ram=memory;
        price=p;
        System.out.println("mobileID :" +mobileID);
        System.out.println("brandName :" +brandName);
        System.out.println("modelName :" +modelName);
        System.out.println("ram :" +ram);
        System.out.println("price :" +price);
        System.out.println("--------------------------");









    }

    static void main() {
        new Mobile(101,"i phone","17 pro max",256,80000);
        new Mobile(102,"one plus","Nord ce2 lite",256,45000);
        new Mobile(103,"google","18 pixel",256,75000);
        new Mobile(101,"nokia","1600",256,80000);



    }
}
