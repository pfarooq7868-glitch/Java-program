package JavaTask;

public class Laptop {
int laptopID;
String brandName;
String ProcessorName;
int ram;
int price;


  Laptop(int ID,String bN,String pN,int memory,int p){
      laptopID=ID;
      brandName=bN;
      ProcessorName=pN;
      ram=memory;
      price=p;
      System.out.println("laptopID :" +laptopID);
      System.out.println("brandName:" +brandName);
      System.out.println("ProcessorName :" +ProcessorName);
      System.out.println("ram :" +ram);
      System.out.println("price :" +price);
      System.out.println("-----------------------------");








  }

    static void main() {
        new Laptop(101,"dell","intel i5",8,64000);
        new Laptop(102,"hp","intel i5",10,55000);
        new Laptop(103,"acer","intel i5",5,63000);
        new Laptop(104,"lenovo","intel i5",12,84000);



    }

}
