/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get one command-line argument: an int value
 * 	that determines how many families to simulate.
 */
public class OneOfEachStats1 {
	public static void main (String[] args) {
		int T = Integer.parseInt(args[0]);
    int totalChildren = 0;
    int twochildlren = 0;
    int threechildren = 0;
    int fourormore = 0;
    for(int i = 0; i<T; i++){
        int childrenPerFamily=0;
        boolean b = false;
        boolean g = false;
        while (!b || !g){
            double prob = Math.random();
            if (prob < 0.5)
			{
                b = true;
            } else 
			{
                g = true;
            }
            totalChildren++;
            childrenPerFamily++;

        } 
        if (childrenPerFamily==2) 
		{
            twochildlren++;
        }
        else if(childrenPerFamily==3)
		{
            threechildren++;
        }else if(childrenPerFamily >= 4)
		{
            fourormore++;
        }
    }
    double average = (totalChildren/(double)T);
     System.out.print("Average: "+ average+ " children to get at least one of each gender");
     System.out.println();
	 System.out.println("Number of families with 2 children: " + twochildlren);
	 System.out.println("Number of families with 3 children: " + threechildren);
	 System.out.println("Number of families with 4 or more children: " + fourormore);
	 String mode;
	
	 if (twochildlren > threechildren && twochildlren > fourormore) {mode = "2";}
	 else if (threechildren > twochildlren && threechildren > fourormore) {mode = "3";}
	 else if (fourormore > twochildlren && fourormore > threechildren) {mode = "4 or more";}
	 else if (twochildlren == threechildren && twochildlren > fourormore) {mode = "2";}
	 else if (twochildlren == fourormore && twochildlren > threechildren) {mode = "2";}
	 else if (threechildren == fourormore && threechildren> twochildlren) {mode = "3";}
	 else {mode = "4 or more";}
	 

	 System.out.println("The most common number of children is " + mode + ".");

	}
}
