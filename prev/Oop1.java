class Employee{
    public int salary;
    public String name;

    public int getSalary(){
        return salary;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setSalary(int salary){
        this.salary = salary;
    }
}

class Cellphone{
    public void Ring(){
        System.out.println("ringing.....");
    }
    public void Vibrate(){
        System.out.println("vibrating.....");
    }
}

class Square{
    public int side;
    public int getSide(){
        return side;
    }
    public void setSide(int side){
        this.side = side;
    }
    public int getArea(){
        return side*side;
    }
    public int getPerimeter(){
        return side*4;
    }
}

class Rectangle{
    public int length;
    public int breadth;
    public int getlength(){
        return length;
    }
    public int getbreadth(){
        return breadth;
    }
    public void setlength(int length){
        this.length = length;
    }
    public void setbreadth(int breadth){
        this.breadth = breadth;
    }
    public int getArea(){
        return length*breadth;
    }
    public int getPerimeter(){
        return 2*(length+breadth);
    }
}

public class Oop1 {
    public static void main(String[] args){
        // Employee john = new Employee();
        // john.setName("John");
        // john.setSalary(100);
        // System.out.println("john's salary "+john.getSalary());
        // System.out.println(john.getName());

        // Cellphone mobile = new Cellphone();
        // mobile.Vibrate();

        // Square square = new Square();
        // square.setSide(5);
        // System.out.println("area "+square.getArea());
        // System.out.println("perimeter "+square.getPerimeter());

        Rectangle rectangle = new Rectangle();
        rectangle.setlength(5);
        rectangle.setbreadth(6);
        System.out.println("area "+rectangle.getArea());
        System.out.println("perimeter "+rectangle.getPerimeter());
    }    
}
