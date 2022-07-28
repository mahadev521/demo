class Animal {
    public void eat() {
        System.out.println("Animal is eating");
    }
    public void move() {
        System.out.println("Animal is moving");
    }
}

class Dog extends Animal {
    Dog() {
        System.out.println("Dog is created");
    }
    public void eat() {
        System.out.println("Dog is eating");
    }
}

public class Qq1 {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.eat();
        Dog dog = new Dog();
        dog.eat();
        dog.move();
    }
}
