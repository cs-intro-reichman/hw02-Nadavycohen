/**
 *  Gets a command-line argument n (int), and prints an n-by-n damka board.
 */
public class DamkaBoard {
	public static void main(String[] args) {
		//// Put your code here
		int n = Integer.parseInt(args[0]);
		int line = 1;
		while (line <= n) {
		 int x = 1;
		 while ( x<= n){
			 if (line%2==0) {
				System.out.print(" *");
			 } 
			 else  {
				 System.out.print("* ");
			 }
			 x=x+1;
		 } 
		 System.out.println();
		 line = line + 1;
		}
		 }
	 }
