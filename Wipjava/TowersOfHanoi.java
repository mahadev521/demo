import java.util.*;

public class TowersOfHanoi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of disks ");
        int n = scanner.nextInt();
        System.out.println("Enter the source peg ");
        int source = scanner.nextInt();
        System.out.println("Enter the destination peg ");
        int destination = scanner.nextInt();
        towersOfHanoi(n, source, destination);
    }
    public static void towersOfHanoi(int n, int source, int destination) {
        if (n>0){
            towersOfHanoi(n-1, source, 6-source-destination);
            System.out.println("Move disk " + n + " from peg " + source + " to peg " + destination);
            towersOfHanoi(n-1, 6-source-destination, destination);
        }
    }
}
