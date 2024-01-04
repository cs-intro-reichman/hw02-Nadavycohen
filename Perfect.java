/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
public class Perfect {
	public static void main (String[] args) {
		//// Put your code here
		int n = Integer.parseInt(args[0]);
		int sum = 1;
		String perfect = n + " is perfect number since " + n + " = 1";

		for (int i =2; i < n; i++ ){
			if (n%i==0){
			sum += i ;
			perfect = perfect + " + " + i;
			}
		}
			if (sum==n){
				System.out.print(perfect);
			}
			
				else {
					System.out.print(n + " is not a perfect number");
				}
			}
		}
