import java.util.*;
public class Pg1 {
    public static void main(String[] args) {
        // int arr[]={0,3,4,6,7,8,3,0,-1};
        int arr[]={1,2,1,2,5};
        int n=5;
        System.out.println(fun(arr,n));
        // int n1=3251;
        // int n2=2452;
        // int n3=1352;
        // int n4=38;
        // System.out.println(fun(n1,n2,n3,n4));
        main
    }
    
    public static int fun(int[] input1, int input2){
    // public static int fun(int input1, int input2, int input3, int input4){

        int temp;
        boolean flag=true;
        Set <Integer> set = new HashSet<Integer>();
        for(int i=0;i<input2;i++){
            temp = input1[i];
            if(temp>0){
                flag=false;
                if(set.contains(temp))
                return temp;
                set.add(input1[i]);
            }
        }
        if(flag)
        return 0;
        return input1[input2-1];



        // int sum=0,max,min;
        // max=0;
        // min=9;
        // while(input1>0){
        //     int rem= input1%10;
        //     input1=input1/10;
        //     if(rem>max)
        //         max=rem;
        //     if(rem<min)
        //         min=rem;
        // }
        // sum+=(max*min);
        // max=0;
        // min=9;
        // while(input2>0){
        //     int rem= input2%10;
        //     input2=input2/10;
        //     if(rem>max)
        //         max=rem;
        //     if(rem<min)
        //         min=rem;
        // }
        // sum+=(max*min);
        // max=0;
        // min=9;
        // while(input3>0){
        //     int rem= input3%10;
        //     input3=input3/10;
        //     if(rem>max)
        //         max=rem;
        //     if(rem<min)
        //         min=rem;
        // }
        // sum+=(max*min);
        // return sum-input4;

    }
}
