import java.util.Scanner;
public class KiloToMiles {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter distance in kilometers: ");
        double kilo=sc.nextDouble();
        double miles=kilo*0.621371;
        System.out.println("Distance in miles: "+miles);
    }
}
