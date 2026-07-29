public class EncapsulationEmployee {
    private int empId;
    private String empName;
    private double salary;
    public void setEmpId(int empId){
        this.empId=empId;
    }
    public void setEmpName(String empName){
        this.empName=empName;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getEmpId() {
        return empId;
    }
    public String getEmpName(){
        return empName;
    }
    public double getsalary(){
        return salary;
    }

    static void main() {
        EncapsulationEmployee obj=new EncapsulationEmployee();
        obj.setEmpId(101);
        obj.setEmpName("Farooq");
        obj.setSalary(80000);
        System.out.println(obj.getEmpId());
        System.out.println(obj.getEmpName());
        System.out.println(obj.getsalary());
    }
}
