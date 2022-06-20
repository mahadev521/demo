public class OverLoading {

    // static int sum(int a, int b){
    //     return a+b;
    // }
    // static int sum(int a, int b,int c){
    //     return a+b+c;
    // }

    static int sum(int ...arr){
        int sum = 0;
        for(int ele:arr){
            sum+=ele;
        }
        return sum;
    }
    public static void main(String[] args){
        int a=23,b=45,c=56;
        System.out.println(sum(a,b));
        System.out.println(sum(a,b,c,a,b,b,b,c));
    }
}
