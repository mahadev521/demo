import java.util.Scanner;
public class Percentage {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter marks of sub1: ");
        int sub1=sc.nextInt();
        System.out.println("Enter marks of sub2: ");
        int sub2=sc.nextInt();
        System.out.println("Enter marks of sub3: ");
        int sub3=sc.nextInt();
        System.out.println("Enter marks of sub4: ");
        int sub4=sc.nextInt();
        System.out.println("Enter marks of sub5: ");
        int sub5=sc.nextInt();
        float total=sub1+sub2+sub3+sub4+sub5;
        float percentage=(total*100)/500;
        System.out.println("Total marks: "+total);
        System.out.println("Percentage: "+percentage);
    }
}
