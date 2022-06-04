import java.util.Scanner;
public class Lowercase {
    public static void main(String[] args){
        // String str = "Hello World";
        // System.out.println(str.toLowerCase());

        // String username="Srimanth Mahadev Kancharla";
        // username=username.replace(' ','_');
        // System.out.println(username);

        //letter format
        Scanner sc= new Scanner(System.in);
        String name=sc.nextLine();
        String message="Dear %s, Thanks a lot for your registration";
        System.out.println(String.format(message,name));
    }
}
