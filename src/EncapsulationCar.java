public class EncapsulationCar {
    private String brand;
    private String model;
    private int year;
    public void setBrand(String brand){
        this.brand=brand;
    }
    public void setModel(String model){
        this.model=model;
    }
    public void setyear(int year){
        this.year=year;
    }
    public String getbrand(){
        return brand;
    }
    public String getmodel() {
        return model;
    }
    public int getYear(){
        return year;
    }

    static void main() {
        EncapsulationCar obj=new EncapsulationCar();
        obj.setBrand("Tata");
        obj.setModel("Nexon");
        obj.setyear(2025);
        System.out.println(obj.getbrand());
        System.out.println(obj.getmodel());
        System.out.println(obj.getYear());
        String name="farooq";
        System.out.println("Name : "+name);

    }


}
