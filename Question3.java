import java.util.Scanner;
public class Question3{
    public static void main(String[] args) {
	 Scanner input = new Scanner(System.in);
         int s;
         s = input.nextInt();//define size of array 
      //The array is defined "arr" and elements are of  integer type.
        int[] arr = new int[s];   
       for(int i=0;i<arr.length;i++)
	   {
 	   arr[i]=input.nextInt();
          }
          int sum=0;
          int c=0;
          for(int j=0;j<s;j++)
          {
             if(arr[j]%2!=0)
             {
               sum=sum+arr[j];
               c=c+1;
             }
          } 
          
           float res=0;
          if(sum!=0)
            res=(float)sum/c;
          
          System.out.print(res);
          }
          }