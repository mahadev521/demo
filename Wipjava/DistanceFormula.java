import java.util.*;
import java.lang.Math;
public class DistanceFormula {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int v=sc.nextInt();
        int u=sc.nextInt();
        int a=sc.nextInt();
        int s=sc.nextInt();
        double dist=(Math.pow(v,2)-Math.pow(u,2))/(2*a*s);
        System.out.println("Dist: " + dist);
    }
}
