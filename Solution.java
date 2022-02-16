import java.util.Scanner;

// public class Solution {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("enter number 1: ");
//         int a=sc.nextInt();
//         System.out.print("enter number 2: ");
//         int b=sc.nextInt();
//         int sum=a+b;
//         System.out.println("Sum of "+a+" and "+b+" is "+sum);
//     }
// }
public class Solution {
    public static String toCSV(String[] array) {
        String result = "";
        if (array.length > 0) {
            StringBuilder sb = new StringBuilder();
            for (String s : array)
                sb.append(s).append(",");
            result = sb.deleteCharAt(sb.length() - 1).toString();
        }
        return result;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] arr1 = str.split(",");
        int c=arr1.length;
        int r=2;
        String[][] mat = new String[2][c];
        mat[0]=arr1;
        String str2 = sc.nextLine();
        String[] arr2 = str2.split(",");
        mat[1]=arr2;
        for (String [] s : mat){
            System.out.println(toCSV(s));
        }
        String[][] mat2 = new String[2][arr1.length];
        for (int i=0;i<2;i++){
            for (String j: mat[i]){
                    System.out.println(j);
            }
            // mat[0][i]
        }
        // System.out.println(toCSV(arr1));
        // System.out.println(toCSV(arr2));
    }
}
