import java.lang.Math;

class Cylinder{
    private int radius;
    private int height;
    private double volume;

    double getVolume(){
        volume = Math.PI*radius*radius*height;
        return volume;
    }

    Cylinder(int radius, int height){
        this.radius = radius;
        this.height = height;
    }

    void setRadius(int radius){
        this.radius = radius;
    }
    int getRadius() {
        return radius;
    }
    void setHeight(int height){
        this.height = height;
    }
    int getHeight() {
        return height;
    }

}


public class Pset4_1{
    public static void main(String[] args){
        // with constructor
        Cylinder cylinder = new Cylinder(5,10);
        System.out.println("The radius of the cylinder is " + cylinder.getRadius());
        System.out.println("The height of the cylinder is " + cylinder.getHeight());



        // without constructors
        // cylinder.setRadius(5);
        // cylinder.setHeight(10);
        // System.out.println("The radius of the cylinder is " + cylinder.getRadius());
        // System.out.println("The height of the cylinder is " + cylinder.getHeight());
        // System.out.println("The volume of the cylinder is " + cylinder.getVolume());
    }
}
