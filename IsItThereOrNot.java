// Straxinja - 5/2020
import java.util.Scanner;
import java.util.Random;

public class IsItThereOrNot
{

	public static void main( String[] args ){

	Scanner scan = new Scanner(System.in);	
	Random rnd = new Random();

	int[] values = new int[10];
	int count = 0;
	int searchNumber;

	System.out.print("Array: ");	
	for(int i = 0; i < values.length; i++){
		values[i] = 1+rnd.nextInt(50);
		System.out.print(values[i] + " ");
	} 
	
	System.out.println();
	System.out.print("Value to find: ");
	searchNumber = scan.nextInt();
	
	for(int val : values){
		if(val == searchNumber){
		count++;		
		}		
	}

	if(count > 0){
		System.out.println(searchNumber + " is in the array.");
		System.out.println();
		System.out.println(searchNumber + " is found in the array " + count + " times.");
 	}
		else {
		System.out.println(searchNumber + " is not in the array.");}		

	}

}
