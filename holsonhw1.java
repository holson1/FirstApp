//	HENRY OLSON
//	OMIS 137
//	HOMEWORK #1
//	1/20/14

package holsonhw1;

//imports for buffered reader and IO
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class holsonhw1 {

	//main (throwing IO Exception is recommended when using IO)
	public static void main (String args[]) throws IOException {
		
		//new buffered input reader for reading strings
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//new string for holding line
		String input = "";
		
		//until user chooses to exit, run this loop
		while (true) {
			//greet the user and prompt for text input
			System.out.println("Hi, what's your name?");
			
			//read in a line
			input = br.readLine();
			
			//if the user typed in nothing, start the while loop over
			if (input.equals("")) continue;
			
			//exit the while loop if the user typed in the "Exit" or "exit" command
			if (input.equals("Exit") || input.equals("exit")) break;
			
			//Print out the user's name
			System.out.println("\n" + input + ", it's so nice to meet you!\n");	
		}
		
		//if the user has exited the while loop, say goodbye
		System.out.println("\nGoodbye!");
		return;
	}
}
