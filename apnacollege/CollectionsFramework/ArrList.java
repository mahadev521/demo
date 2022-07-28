import java.util.*;
public class ArrList{
    public static void main(String[] args) {
        ArrayList <Integer> arr= new ArrayList<>();
        arr.add(1);
        arr.add(12);
        arr.add(13);
        arr.add(7);
        arr.add(5);
        Collections.reverse(arr);
        System.out.println(arr);

        Collections.sort(arr,Collections.reverseOrder());
        System.out.println(arr);
    }
}