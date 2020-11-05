// Straxinja - 5/2020
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
public class WhereIsIt
{

	public static void main( String[] args ){
	
	Random rnd = new Random();
	Scanner scan = new Scanner(System.in);	
	int[] values = new int[10];
	int toFind;
	
	System.out.print("Arrays: ");

	for(int i = 0; i < values.length; i++){
		values[i] = 1+rnd.nextInt(50);
		System.out.print(values[i] + " ");		
	 }

	System.out.print("Value to find: ");
	toFind = scan.nextInt();	
	
	for(int val : values){
		if(val == toFind){
			System.out.println(toFind + " is in the slot "+ Arrays.binarySearch(values,toFind) +".");
		}
	}
	
	}

}
