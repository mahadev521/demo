public class Rhombus {
    public static void main(String[] args) {
        int n=4;
        for (int i=0; i<n; i++){
            for(int j=n-i;j>0;j--){
                System.out.print(" ");
            }
            for(int j=0;j<n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
