package JavaTask;

public class Product {
    int productID;
    String productName;
    int quantity;
    String brandName;
    double price;
    Product(int ID,String Name,int qu,String bN,double p) {
        productID=ID;
        productName=Name;
        quantity=qu;
        brandName=bN;
        price=p;
        System.out.println("product ID: " + productID);
        System.out.println("product Name: " + productName);
        System.out.println("quantity: " + quantity);
        System.out.println("brand Name: " + brandName);
        System.out.println("price: " + price);
        System.out.println("--------------------------------");
    }

    static void main() {
        new Product(123,"washing machine",10,"LG",500000);
        new Product(134,"Laptop",5,"Dell",200000);
        new Product(165,"water purifier",5,"pure it",100000);
        new Product(127,"Air conditioner",5,"LG",200000);
    }
    }



