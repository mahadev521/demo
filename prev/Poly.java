interface gps{
    void enableLocation();
    void disableLocation();
}

class Cellphone{
    void call(){
        System.out.println("Calling");
    }
}

class SmartPhone extends Cellphone implements gps{
    public void enableLocation(){
        System.out.println("Location enabled");
    }
    public void disableLocation(){
        System.out.println("Location disabled");
    }
    public void call(){
        System.out.println("Calling from SmartPhone");
    }
    public void capture(){
        System.out.println("Capturing");
    }
    public void recordVideo(){
        System.out.println("Recording Video");
    }
}

public class Poly {
    public static void main(String[] args) {
        // Cellphone s = new SmartPhone();
        SmartPhone s = new SmartPhone();
        s.call();
        s.capture();
        s.enableLocation();

    }
}
