//	Henry Olson
//	HW2 - Array Sorting
//	OMIS 137
//	1/25/14

package holsonhw2;

import java.io.*;
import java.util.Scanner;

public class holsonhw2 {
	
	public static void main(String args[])
	throws IOException {
		//declare and initialize the array
		int a[] = new int[6];
		//declare a scanner object
		Scanner in = new Scanner(System.in);
		//declare for loop ints
		int i, j, temp;
		//string for holding skipped inputs
		String skipped = new String();
		
		//***FILL ARRAY***
		//run for 6 times to fill array
		for(i=0; i<6; i++) {
			//start without a number
			boolean num = false;
		
			//prompts for a number until it receives one
			while(!num) {
				System.out.println("Integer" + (i+1) + ":");
				
				//check to see if there's at least one int entered
				if(in.hasNextInt()) {
					a[i] = in.nextInt();
					//clear scanner and alert user of what was cleared
					skipped = in.nextLine();
					if(! skipped.equals("")) System.out.println("Input(s) '" 
							+ skipped + 
							"' will not be saved. Only the integer " +
							a[i] + " was saved.");
					num = true;
				}
				else {
					//friendlier than an IOException
					System.out.println("Please enter an integer.");
					in.nextLine();
				}
			}
		}
		
		//***SORT ARRAY***
		//Use bubble sort to sort array in ascending order
		// O(n^2)
		for(i=0; i<6; i++) {
			//sort from right to left, decreasing search size each time
			for(j=5; j>i; j--) {
				//if an element is smaller than its left neighbor
				if(a[j] < a[j-1]) {
					//swap them
					temp = a[j];
					a[j] = a[j-1];
					a[j-1] = temp;
				}
			}
		}
		
		//***PRINT ARRAY***
		System.out.println("\nInteger array sorted in ascending order:");
		//loop through array and print
		for(i=0; i<6; i++) {
			System.out.print(a[i]);
			System.out.print(" ");
		}
	}
}
