package Inheritance;

public class Employee extends Company {
    String employeeName;
    Employee(String companyName, String location,String employeeName) {
        super(companyName, location);
        this.employeeName=employeeName;
    }
    void showEmployeeinfo(){
        System.out.println("Employee name:" +employeeName);
        System.out.println("Location:"+location);
    }
    public static void main(String[]args){
        Employee e=new Employee("Mphasis","Chennai","Farooq Khan");
        e.showcompanyonfo();
        e.showEmployeeinfo();
    }
}