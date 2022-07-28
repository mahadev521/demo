import java.util.Scanner;
public class Pattern {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        printPattern(n);
    }
    public static void printPattern(int n) {
        for(int i=0;i<n;i++){
            System.out.print("*");
        }
        System.out.println();
        if(n>1){
            printPattern(n-1);
        }
    }
}
