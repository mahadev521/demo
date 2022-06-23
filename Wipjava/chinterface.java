interface Bicycle {
    void changeGear(int newGear);

    void speedUp(int increment);

    void applyBrakes(int decrement);
}

class Herocycle implements Bicycle {
    int speed;
    int gear;

    Herocycle(int startSpeed, int startGear) {
        speed = startSpeed;
        gear = startGear;
    }

    public void changeGear(int newGear) {
        gear = newGear;
        System.out.println("Gear changed to " + gear);
    }

    public void speedUp(int increment) {
        speed = speed + increment;
    }

    public void applyBrakes(int decrement) {
        speed = speed - decrement;
    }
}

public class chinterface {
    public static void main(String[] args) {
        Herocycle hc = new Herocycle(10,1);
        hc.changeGear(2);
        hc.speedUp(10);
        hc.applyBrakes(5);
        System.out.println("Speed is " + hc.speed);
        System.out.println("Gear is " + hc.gear);
        
    }
}
