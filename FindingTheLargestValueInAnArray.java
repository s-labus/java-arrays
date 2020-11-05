// Straxinja - 5/2020

import java.util.Random;
import java.util.Arrays;

public class FindingTheLargestValueInAnArray
{

	public static void main( String[] args ){

	Random rnd = new Random();
	int[] values = new int[10];
	
	System.out.print("Array: ");
	for(int i = 0; i < values.length; i++){
		values[i] = 1 + rnd.nextInt(100);
		System.out.print(values[i] + " ");
	}
	
	Arrays.sort(values);
	System.out.println();
	
	System.out.println("The largest value is " + values[values.length-1]);	
	}

}
