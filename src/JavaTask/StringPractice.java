package JavaTask;

public class StringPractice {
    static void main() {
        String name ="farooq khan";
        String name2="farooq khan";
        String name3="";
        System.out.println("name :"+name);
        System.out.println("name :"+name.length());
        System.out.println(name.concat(" pathan"));
        System.out.println(name.trim());
        System.out.println(name.startsWith(" far"));
        System.out.println(name.endsWith("an "));
        System.out.println(name.replace('q','k'));
        System.out.println(name.charAt(6));
        System.out.println(name.substring(1,6));
        System.out.println(name.equals(name2));
        System.out.println(name.toUpperCase());
        System.out.println(name3.toLowerCase());
        System.out.println(name3.contains("FAROOQ"));
        System.out.println(name3.isEmpty());
    }

}
