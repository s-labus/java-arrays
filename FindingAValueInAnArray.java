// Straxinja - 5/2020
import java.util.Random;
import java.util.Scanner;

public class FindingAValueInAnArray
{

	public static void main( String[] args ){
	Scanner scan = new Scanner(System.in);		
	Random r = new Random();
	int v;
	int[] values = new int[10];
	
	for(int i = 0; i < values.length; i++){
		values[i] = 1 + r.nextInt(50);
		if(i == 0){
			System.out.print("Array: ");
		}
		System.out.print(values[i] + " "); 
	}
	System.out.println();
	System.out.print("Value to find: ");
	v = scan.nextInt();

	for(int val : values){
		if(val == v){
			System.out.println(val + " is in the array.");
			}
		}

	}

}
