import java.util.*;
public class PowerOfX {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number x ");
        int x = scanner.nextInt();
        System.out.println("Enter the power n ");
        int n = scanner.nextInt();
        // int x=3,n=5;
        System.out.println(power(x,n));
    }
    public static int power(int x,int n){
        if(n==0)
            return 1;
        if(n%2==0){
            int temp=power(x,n/2);
            return temp*temp;
        } 
        else{
            int temp=power(x,(n-1)/2);
            return x*temp*temp;
        }
    }
}
