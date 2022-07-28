import java.util.Scanner;

public class SpaceIp {
    public static void main(String[] args) {
        // space seperated input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        String[] inputArray = sc.nextLine().split(" ");
        int[] intArray = new int[inputArray.length];
        for (int i = 0; i < inputArray.length; i++) {
            intArray[i] = Integer.parseInt(inputArray[i]);
        }
        for (int ele : intArray) {
            System.out.print(ele + " ");
        }
    }
}
