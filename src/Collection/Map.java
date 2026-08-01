package Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;




public class Map {
    public static void main(String[]args){
        HashMap<Integer,String>map=new HashMap<>();
        map.put(1,"Farooq");
        map.put(2,"Fazil");
        map.put(3,"Salma");
        map.put(4,"Nuha");
        map.put(5,"Nubha");
        System.out.println(map);
        LinkedHashMap<Integer,String>map1=new LinkedHashMap<>();
        map1.put(1,"Apple");
        map1.put(2,"Banana");
        map1.put(3,"Orange");
        map1.put(4,"Kiwi");
        map1.put(5,"Dragon");
        System.out.println(map1);
        TreeMap<Integer,String>map2=new TreeMap<>();
        map2.put(1,"Apple");
        map2.put(3,"guava");
        map2.put(5,"papaya");
        map2.put(2,"orange");
        map2.put(4,"Kiwi");
        System.out.println(map2);




    }
}
