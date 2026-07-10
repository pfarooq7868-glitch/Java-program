package JavaTask;



public class Student {
    int studentID;
    String studentName;
    String departmentName;
    String collegeName;
    int marks;
    Student(int ID,String Name,String dN,String cN,int mr){
        studentID=ID;
        studentName=Name;
        departmentName=dN;
        collegeName=cN;
        marks=mr;
        System.out.println("student ID: " +studentID);
        System.out.println("student Name: " +studentName);
        System.out.println("department Name: " +departmentName);
        System.out.println("college Name : " +collegeName);
        System.out.println("marks : " +marks);
        System.out.println("-------------------------------");



    }

    static void main() {
        new Student(101,"Farooq","ECE","S.A",100);
        new Student(102,"Vishali","CSE","S.A",90);
        new Student(103,"Kavitha","EEE","S.A",80);


    }

}
