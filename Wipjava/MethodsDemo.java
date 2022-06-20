import java.util.Scanner;
public class MethodsDemo {
    // cannot declare a method without datatype
    int sum(int a, int b){
        return a + b;
    }

    int diff(int a, int b){
        if(a>b){
            return a-b;
        }
        return b-a;
    }

    int prod(int a, int b){
        return a*b;
    }
    //static method is shared by all the objects
    static void tellJoke(){
        System.out.println("Why did the chicken cross the road?");
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        MethodsDemo md = new MethodsDemo(); //constructor for methods
        System.out.printf("sum of %d and %d id %d\n",a,b,md.sum(a,b));
        System.out.printf("diff of %d and %d id %d\n",a,b,md.diff(a,b));
        System.out.printf("prod of %d and %d id %d\n",a,b,md.prod(a,b));
        tellJoke(); //No need of a constructor
    }    
}
