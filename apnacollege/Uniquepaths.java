import java.util.*;
public class Uniquepaths {

    public static int uPaths(int i, int j, int n, int m){
        if(i==n || j==m){
            return 0;
        }
        if(i==n-1 && j==m-1){
            return 1;
        }
        return uPaths(i+1,j,n,m) + uPaths(i,j+1,n,m);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int uniquepaths=uPaths(0,0,n,m);
        System.out.println(uniquepaths);
    }
    
}
