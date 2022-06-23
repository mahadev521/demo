public class Butterfly {
    public static void main(String[] args) {
        int n=4;
        for (int i=1; i<n+1; i++){
            int x=i*2;
            for(int j=1; j<i+1;j++){
                System.out.print("*");
            }
            for(int j=1; j<(n*2)-x+1;j++){
                System.out.print(" ");
            }
            for(int j=1; j<i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i=n; i>0; i--){
            int x=i*2;
            for(int j=1; j<i+1;j++){
                System.out.print("*");
            }
            for(int j=1; j<(n*2)-x+1;j++){
                System.out.print(" ");
            }
            for(int j=1; j<i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
