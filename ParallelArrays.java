// Straxinja - 5/2020
import java.util.Scanner;

public class ParallelArrays
{

	public static void main( String[] args ){
	Scanner scan = new Scanner(System.in);
	System.out.println("Values:\n");

	int find;
	String[] lastName = {"Mitchell", "Ortiz", "Labus", "Zimmerman", "Petrovich"};	
	double[] avgGrade = {99.5, 78.5, 95.6, 96.8, 82.7};
	int[] studentId = {123, 456, 823, 307, 760};

	for(int i = 0; i < studentId.length; i++){
		System.out.println("\t"+lastName[i] + " " + avgGrade[i] + " " + studentId[i]);
	}

	System.out.println();
	System.out.print("ID number to find: ");
	find = scan.nextInt();
	
	System.out.println();

	int slot = 0;
	
	for(int i = 0; i < studentId.length; i++){
		if(studentId[i] == find){
		slot = i;
		}
	}

	System.out.println("Found in slot " + slot);
	System.out.println("\tName: " + lastName[slot] + "\n" + "\tAverage: " + avgGrade[slot] + "\n" + "\tID: " + studentId[slot] + "\n");
 }

}
