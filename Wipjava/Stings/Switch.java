import java.util.*;
public class Switch {
    public static void main(String[] args){
        int age;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age");
        age = scanner.nextInt();
        switch(age){
            case 18:
                System.out.println("live long young man");
                break;
            case 30:
                System.out.println("You are at middle of your life look forward");
                break;
            case 60:
                System.out.println("Time to retire");
                break;
            default:
                System.out.println("Enjoy your life");
                break;
        }
    }
}
