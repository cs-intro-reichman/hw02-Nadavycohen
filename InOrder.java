/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
public class InOrder {
	public static void main (String[] args) {
		//// Write your code here
		int a = (int)((Math.random()*(10+1)));
		System.out.print(a + " ");

		do{
			int b = (int)(Math.random()*(10+1));
			if(b>=a)
			System.out.print(b+ " ");
			else break;
			a = b;
		}
		while (true);
			
	}
}
