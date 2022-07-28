import java.util.Scanner;

public class Java2 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        System.out.println("enter your first name: ");
        String firstname = input.next();
        
        System.out.println("enter your second name: ");
        String lastname = input.next();

        System.out.println("your full name is "+firstname+" "+lastname);
    }
}
