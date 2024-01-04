
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main (String[] args) {
		//// Put your code here
		boolean b = false;
		boolean g = false;
		int count = 0;
		while (!b || !g){
			double prob = Math.random();
			if (prob < 0.5){
				g = true;
				count++;
				System.out.print("g ");
			} else {
				b = true;
				count++;
				System.out.print("b ");
			}
		} System.out.println();
		System.out.print("You made it... and you have " + count + " children");
	} 
	}
