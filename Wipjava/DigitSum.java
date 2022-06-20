import java.util.Scanner;
public class DigitSum {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        long n=sc.nextLong();
        while(n>10)
        n=n%10+n/10;
        System.out.print(n);
    }
}
