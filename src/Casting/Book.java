package Casting;

 class Book {
     void read(){
         System.out.println("Book reading");
     }
}
class Fiction extends Book{
     @Override
    void read(){
         System.out.println("Fiction book reading");
     }
     void story(){
         System.out.println("Fiction story");

     }
}
class Nonfiction extends Book{
     @Override
    void read(){
         System.out.println("Nonfiction book reading");
     }
}
class Bookmain{
     public static void main(String[]args){
         Book b=new Fiction();
         b.read();
         Fiction f=(Fiction)b;
         f.story();
     }
}
