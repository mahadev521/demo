interface cycle{
    void move();
    void stop();
}

class Hero{
    void brand(){
        System.out.println("Hero");
    }
    void price(){
        System.out.println("Rs.1,00,000");
    }
}

class Herocycle extends Hero implements cycle{
    public void move(){
        System.out.println("Herocycle moving");
    }
    public void stop(){
        System.out.println("Herocycle stopped");
    }
}

public class interfac {
    public static void main(String[] args) {
        cycle c = new Herocycle();
        c.move();
        c.stop();        
    }
}
