package Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;



public class Set {
    public static void main(String[]args){
        HashSet<String>cities=new HashSet<>();
        cities.add("Hyderabad");
        cities.add("chennai");
        cities.add("mumbai");
        cities.add("kochi");
        cities.add("kolkatta");
        System.out.println(cities);
        LinkedHashSet<String>cars=new LinkedHashSet<>();
        cars.add("ford");
        cars.add("Tata");
        cars.add("Honda");
        cars.add("TOyota");
        cars.add("Bmw");
        System.out.println(cars);
        TreeSet<Integer>numbers=new TreeSet<>();
        numbers.add(50);
        numbers.add(30);
        numbers.add(10);
        numbers.add(20);
        numbers.add(40);
        System.out.println(numbers);
    }
}
