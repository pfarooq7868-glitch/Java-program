package JavaTask;

public class Course {
    int courseID;
    String courseName;
    String trainerName;
    int duration;
    int fee;
    Course(int ID,String couName,String mentorName,int months,int amount){
        courseID=ID;
        courseName=couName;
        trainerName=mentorName;
        duration=months;
        fee=amount;
        System.out.println("courseID :"+ courseID);
        System.out.println("courseName :"+ courseName);
        System.out.println("trainerName :"+ trainerName);
        System.out.println("duration :"+ duration);
        System.out.println("fee :"+ fee);
        System.out.println("-----------------------------");











    }

    static void main() {
        new Course(101,"Java","Afreen",1,10000);
        new Course(102,"selenium","Afreen",1,10000);
        new Course(103,"QA","Afreen",2,10000);
        new Course(104,"AWS","Afreen",1,20000);
        new Course(105,"Devops","Afreen",1,25000);





    }




}
