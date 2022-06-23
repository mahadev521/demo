interface Parent{
    void meth1();
    default void meth2(){
        System.out.println("Parenting");
    }
}

interface Parent2{
    void meth3();
    void meth4();
}


interface Child extends Parent2,Parent{
    void meth4();
    void meth3();
}

class Child2 implements Child{
    public void meth1(){
        System.out.println("Child1");
    }
    // public void meth2(){
    //     System.out.println("Child2");
    // }
    public void meth3(){
        System.out.println("Child3");
    }
    public void meth4(){
        System.out.println("Child4");
    }
}
public class multiinterface {
    public static void main(String[] args) {
        Child2 Child2 = new Child2();
        Child2.meth2();
    }
}
