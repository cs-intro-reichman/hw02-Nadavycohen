/**
 *  Gets a command-line argument (int), and prints all the divisors of the given number.
 */
public class Divisors {
	public static void main (String[] args) {
		int k = Integer.parseInt(args[0]);
		for (int i = 1; i <= k; i++){
			if (k % i == 0)
			System.out.println(i);
		}
		//// Put your code here
	}
}
