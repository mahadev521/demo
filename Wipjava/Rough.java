import java.util.*;

class Base{
    public Base(){
        System.out.println("Base class constructor");
    }
}

class Derived extends Base{
    public Derived(){
        System.out.println("Derived class constructor");
    }
}

class Grandchild extends Derived{
    public Grandchild(){
        System.out.println("Grandchild class constructor");
    }
}

public class Rough {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        Grandchild gc= new Grandchild();


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
        // System.out.println("Enter a number: ");
        // int n=sc.nextInt();
        // int fact=1;
        // for(int i=1;i<=n;i++){
        //     fact=fact*i;
        // }
        // System.out.println("Factorial of "+n+" is: "+fact);


        //float array
        // float [] arr=new float[5];
        // float sum=0;
        // for(int i=0;i<5;i++){
        //     System.out.printf("Enter number %d: ",i+1);
        //     arr[i]=sc.nextFloat();
        //     sum+=arr[i];
        // }
        // System.out.println("Sum of all numbers is: "+sum);
        // System.out.println("Average of all numbers is: "+sum/5);

        //find given number in a array or not
        // int arr[]={34,67,45,34,22};
        // System.out.print("Enter a number: ");
        // int n=sc.nextInt();
        // boolean flag=false;
        // for(int i=0;i<arr.length;i++){
        //     if(arr[i]==n){
        //         flag=true;
        //         break;
        //     }
        // }
        // if(flag){
        //     System.out.println("Number is present in the array");
        // }
        // else{
        //     System.out.println("Number is not present in the array");
        // }


        // int arr[]={1,2,3,4,5,6,7};
        // int n=arr.length;
        // for(int i=0; i<n/2; i++){
        //     int temp=arr[i];
        //     arr[i]=arr[n-i-1];
        //     arr[n-i-1]=temp;
        // }
        // for(int temp:arr){
        //     System.out.print(temp+" ");
        // }


        // random array of elements
        // int arr[]={45,76,34,65,123,54,78,98,12,56,78,43,67,1,54,34,78,98,99,87,90,85,82};
        //finding min and max
        // int n=arr.length;
        // int max=0,min=arr[0];
        // for(int temp:arr){
        //     if(temp>max){
        //         max=temp;
        //     }
        //     if(min>temp){
        //         min=temp;
        //     }
        // }
        // System.out.println("Maximum element is: "+max);
        // System.out.println("Minimum element is: "+min);

        // int arr[]={45,76,34,65,123,54,78,98,12,56,78,43,67,1,54,34,78,98,99,87,90,85,82};
        // int arr[]={1,2,3,4,5};
        // int n=arr.length;
        // int temp=arr[0];
        // boolean sort=true;
        // for(int i=1; i<n; i++){
        //     if(temp<arr[i]){
        //         temp=arr[i];
        //     }
        //     else{
        //         sort=false;
        //         break;
        //     }
        // }
        // if(sort){
        //     System.out.println("Array is sorted");
        // }
        // else{
        //     System.out.println("Array is not sorted");
        // }
    }

}
