class Phone {
    void meth1() {
        System.out.println("meth1 from Phone");
    }

    void meth2() {
        System.out.println("meth2 from Phone");
    }
}

class SmartPhone extends Phone {
    @Override
    void meth2() {
        System.out.println("meth2 from SmartPhone");
    }

    void meth3() {
        System.out.println("meth3 from SmartPhone");
    }
}

public class Dynamic {
    public static void main(String[] args) {
        Phone p = new SmartPhone();
        p.meth1();
        p.meth2();
        // p.meth3();
    }
}
