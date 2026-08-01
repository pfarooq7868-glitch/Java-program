package Inheritance;

public class Student extends Person {
    int rollNo;
    Student(String name, int age,int rollNo) {
        super(name, age);
        this.rollNo=rollNo;
    }
    void displayStudent(){
        displayPerson();
        System.out.println("Roll No:" +rollNo);
    }
    public static void main(String[]args){
        Student s=new Student("Farooq",28,101);
        s.displayStudent();
    }
}
