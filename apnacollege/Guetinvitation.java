import java.util.*;
public class Guetinvitation {
    public static int guest(int n){
        if(n<=1){
            return 1;
        }
        return guest(n-1) + (n-1)*guest(n-2);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int ways_to_invite=guest(n);
        System.out.println(ways_to_invite);
    }
}
