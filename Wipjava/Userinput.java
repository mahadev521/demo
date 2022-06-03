//reading user data
import java.util.Scanner;
public class Userinput{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int num1=sc.nextInt();
        System.out.println("Enter number 2: ");
        int num2=sc.nextInt();
        System.out.print("Sum of num1 and num2 is "+(num1+num2));
        String name=sc.next();
        System.out.println("Hello "+name);
    }
}