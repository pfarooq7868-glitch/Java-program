public class Encapsulation {
    private int id;
    private String name;
    public void setId(int id1){
        this.id=id1;
    }
    public void setname(String name){
        this.name=name;
    }
    public int getId() {
        return id;
    }
        public String getname(){
        return name;


    }

    static void main() {
        Encapsulation obj=new Encapsulation();
                obj.setId(101);
                obj.setname("Farooq");
        System.out.println(obj.getId());
        System.out.println(obj.getname());


    }



}
