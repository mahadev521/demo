// Write a program to accept two numbers and print whether their sum is EVEN or ODD
import java.util.Scanner;
public class SumEvenOrOdd {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a+b;
        if(sum%2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
}
