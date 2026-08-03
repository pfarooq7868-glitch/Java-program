package Polymorphism;

public class Volume {
    void calculateVolume(double side){
        System.out.println("Volume of cube="+(side*side*side));
    }
    void calculateVolume(double length,double width,double height){
        System.out.println("Volume of Rectangle Prism="+(length*width*height));
    }
    void calculateVolume(float radius){
        System.out.println("Volume of Sphere="+((4.0/3)*3.14*radius*radius*radius));
    }
    public static void main(String[]args){
        Volume v=new Volume();
        v.calculateVolume(4.0);
        v.calculateVolume(5,4,3);
        v.calculateVolume(3f);
    }
}
