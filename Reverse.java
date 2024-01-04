/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main (String[] args){
		String word = args[0];
		int n = word.length();
		int i = n - 1;
		int a = word.length()/2-1;
		int b = word.length()/2;
		while (i>=0)
		{

			System.out.print(word.charAt(i));
			i= i-1;

		}
	System.out.println();	
	
	if (word.length()%2 == 0)
	{
		System.out.println("The middle character is " + word.charAt(a));
	} else {
		System.out.println("The middle character is " + word.charAt(b));
	}

	}
		
	}
