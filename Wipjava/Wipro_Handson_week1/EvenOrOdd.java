// Write a program to accept a number N and print whether the number is EVEN or ODD
import java.util.Scanner;
public class EvenOrOdd {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        if(n%2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
}
