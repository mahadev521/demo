import java.util.*;

public class Pattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n");
        int n = sc.nextInt();
        int o=0,e=1;
        for(int i=1;i<n+1;i++) {
            for(int j=0;j<i;j++){
                if(i%2==0){
                    if(j%2==0){
                        System.out.print(o);
                    }
                    else{
                        System.out.print(e);
                    }
                }
                else{
                    if(j%2==0){
                        System.out.print(e);
                    }
                    else{
                        System.out.print(o);
                    }
                }
            }
            System.out.println();
        }
    }
}

    // for(int i=0;i<n;i++){
    //     for(int j=0;j<n;j++){
    //         if(i==0||i==n-1){
    //             System.out.print("*");
    //         }
    //         else if(j==0||j==n-1){
    //             System.out.print("*");
    //         }
    //         else{
    //             System.out.print(" ");
    //         }
    //     }
    //     System.out.println();
    // }