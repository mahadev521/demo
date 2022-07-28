import java.util.*;

public class Subseq {

    public static void seq(String str, int index, String newString,HashSet<String> set) {
        if (index==str.length()){
            if (set.contains(newString)){
                return;
            }
            else{
                set.add(newString);
                System.out.println(newString);
                return;
            }
            // System.out.println(newString);
            // return;
        }
        //to come
        seq(str, index+1, newString+str.charAt(index),set);
        //not to come
        seq(str, index+1, newString,set);
    }
    public static void main(String[] args) {
        String str= new String("abc");
        HashSet<String> set = new HashSet<String>();
        seq(str,0,"",set);
        // System.out.println(str);
    }
    
}
