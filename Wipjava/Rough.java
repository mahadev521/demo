import java.util.*;
public class Rough {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        // int a=10;
        // if(a==11){
        //     System.out.println("a is equal to 11");
        // }
        // else
        // System.out.println("a is not equal to 11");
        
        // Tax paying problem
        // System.out.println("Enter income in lakhs");
        // float tax;
        // float income=sc.nextFloat();
        // if(income>10.0f){
        //     tax=(income*30)/100.0f;
        // }
        // else if(income>=5.0f && income < 10.0f){
        //     tax=(income*20)/100.0f;
        // }
        // else if(income>=2.5f && income<5.0f){
        //     tax=(income*5)/100.0f;
        // }
        // else{
        //     tax=0.0f;
        // }
        // System.out.println("Tax is: "+tax);


        // Find the website
        // String website=sc.nextLine();
        // if(website.endsWith(".com")){
        //     System.out.println("Website is a Commercial Website");
        // }
        // else if(website.endsWith(".org")){
        //     System.out.println("Website is an organisation Website");
        // }
        // else if(website.endsWith(".in")){
        //     System.out.println("Website is an Indian Website");
        // }
        // else{
        //     System.out.println("Website is not a valid website");
        // }
        
        // for(int i=4;i>0;i--){
        //     for(int j=i;j>0;j--){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        //sum of first n even numbers using while
        // int i=0,sum=0,n=10,j=1;
        // while(i<n){
        //     if(j%2==0){
        //         sum=sum+j;
        //         i++;
        //     }
        //     j++;
        // }
        // System.out.println("Sum of first "+n+" even numbers is: "+sum);


        // for(int i=10;i>0;i--){
        //     System.out.printf("10 X %d = %d\n",i,10*i);
        // }


        //table of a number
        // System.out.println("Enter a number: ");
        // int n=sc.nextInt();
        // System.out.print();
        // for(int i=1;i<11;i++){
        //     System.out.printf("%d X %d = %d\n",n,i,n*i);
        // }

        //factorial
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        System.out.println("Factorial of "+n+" is: "+fact);
    }
}
