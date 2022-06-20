public class Q1 {
    public static void main(String[] args){
        int n1=1,n2=452,n3=1352,n4=23,n5=43;
        System.out.println(fun(n1,n2,n3,n4,n5));
    }


    
   
    public static int fun(int input1,int input2,int input3,int input4, int input5){
        int sum=0;
        if(func(input1))
        sum+=input1;
        if(func(input2))
        sum+=input2;
        if(func(input3))
        sum+=input3;
        if(func(input4))
        sum+=input4;
        if(func(input5))
        sum+=input5;
        return sum;
    }
    public static boolean func(int n){
        int arr[]={0,0,0,0,0,0,0,0,0,0};
        while(n>0){
            int res=n%10;
            arr[res]+=1;
            n=n/10;
        }
        int flag=0;
        for(int i: arr){
            if(i!=0 && flag==0)
                flag=i;
            if(i!=0 && i!=flag)
                return true;
        }
        return false;
    }
}
