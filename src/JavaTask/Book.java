package JavaTask;

public class Book {
    int bookId;
    String bookName;
    double price;
    Book(int id,String name,double p) {
        bookId = id;
        bookName = name;
        price = p;
        System.out.println("Book ID: " + bookId);
        System.out.println("Book Name: " + bookName);
        System.out.println("price: " + price);
        System.out.println("-------------");
    }

    static void main() {
        new Book(1,"core java",500);
        new Book(2,"selenium web driver",700);
    }
    }

