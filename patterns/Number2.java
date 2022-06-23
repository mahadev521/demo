public class Number2 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i < n + 1; i++) {
            for (int j = 0; j < 2*(n - i); j++) {
                System.out.print(" ");
            }
            for (int j = i; j > 1; j--) {
                System.out.print(j + " ");
            }
            for (int j =1; j <i+1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
