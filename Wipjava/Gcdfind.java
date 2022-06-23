public class Gcdfind {
    public static void main(String[] args) {
        // find gcd of two numbers 
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int gcd = gcd(a, b);
        System.out.println("GCD of " + a + " and " + b + " is " + gcd);

        
    }
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
    
}
