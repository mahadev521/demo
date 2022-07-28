abstract class Pen{
    abstract void write();
    abstract void refill();
}

class FountainPen extends Pen{
    public void write(){
        System.out.println("Fountain Pen writing");
    }
    public void refill(){
        System.out.println("Fountain Pen refilling");
    }
    public void changenib(){
        System.out.println("Fountain Pen changing nib");
    }
}
public class Q1 {
    public static void main(String[] args) {
        Pen p = new FountainPen();
        p.write();
        p.refill();   
        // p.changenib(); // Error: Method not found: changenib()
    }
}