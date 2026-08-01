package Collection;
import java.util.ArrayList;
import java.util.LinkedList;


public class List {
    public static void main(String[]args){
        ArrayList<String>fruits=new ArrayList<>();
        fruits.add("Apple");
        fruits.add("orange");
        fruits.add("papaya");
        fruits.add("grapes");
        fruits.add("kiwi");
        System.out.println(fruits);
        LinkedList<Integer>numbers=new LinkedList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        System.out.println(numbers);
    }
}
