package JavaTask;

public class Employee {

    int employeeID;
    String employeeName;
    String designation;
    String companyName;
    int salary;
    Employee(int ID,String empName,String role,String compName,int sal){
        employeeID=ID;
        employeeName=empName;
        designation=role;companyName=compName;
        salary=sal;
        System.out.println("employee ID :" +employeeID);
        System.out.println("employee Name :" +employeeName);
        System.out.println("designation :" +designation);
        System.out.println("companyName:" +companyName);
        System.out.println("salary :" +salary);
        System.out.println("------------------------------");






    }

    static void main() {
        new Employee(123,"farooq","QA LEAD","Deloitte",850000);
        new Employee(124,"zakiya","QA LEAD","wipro",850000);
        new Employee(125,"fazil","junior QA","wipro",850000);



    }
}
