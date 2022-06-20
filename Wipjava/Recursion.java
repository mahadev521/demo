import java.util.Scanner;
public class Recursion {

    static int factorial(int n){
        if(n==0||n==1)
        return 1;
        return n*factorial(n-1);
    }

    static int fibonacci(int n){
        if(n==0)
        return 0;
        if(n==1)
        return 1;
        return fibonacci(n-1)+fibonacci(n-2);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter a number to know its factorial!: ");
        System.out.print("Enter a number n to get nth fibinocci number!: ");
        int a= sc.nextInt();
        System.out.printf("%dth fibinocci number is %d",a,fibonacci(a));
        // System.out.printf("Factorial of %d is %d\n",a,factorial(a));
    }
}
