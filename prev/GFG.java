// Calculate the Sum of First N Odd & Even Numbers in Java
import java.io.*;

public class GFG {

	// Driver function
	public static void main(String[] args)
	{
		int n;
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		int oddSum = 0;
		for (int i = 1; i <= 2 * n; i++) {
			// check even & odd using Bitwise AND operator
			if ((i & 1) != 0)
				oddSum += i;
		}

		System.out.println("Sum of First " + n + " Odd numbers = " + oddSum);
	}
}
