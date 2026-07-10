package JavaTask;

public class Hospital {
    int hospitalID;
    String hospitalName;
    String location;
    int doctorCount;
    long contactNumber;
    Hospital(int ID,String Name,String Loc,int Count,long  Number){
        hospitalID=ID;
        hospitalName=Name;
        location=Loc;
        doctorCount=Count;
        contactNumber=Number;
        System.out.println("hospital ID :" +hospitalID);
        System.out.println("hospital Name :" +hospitalName);
        System.out.println("location :" +location);
        System.out.println("doctorCount :" +doctorCount);
        System.out.println("location :" +location);
        System.out.println("contactNumber :" +contactNumber);
        System.out.println("--------------------------------------");




    }

    static void main() {
        new Hospital(14321,"Apollo","Hyderabad",10,8688053960L);
        new Hospital(14322,"RAMACHANDRA","chennai",10,8688053860L);

    }
}
