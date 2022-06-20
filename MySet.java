import java.util.Set;
import java.util.HashSet;

public class MySet {
    public static void main(String[] args){
        Set s= new HashSet();
        s.add("Hello");
        s.add("Apple");
        s.add("Apple");
        System.out.println(s);
    }
}
