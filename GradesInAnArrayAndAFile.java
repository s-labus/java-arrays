// Straxinja - 5/2020

import java.util.Scanner;
import java.util.Random;
import java.io.FileWriter;
import java.util.Arrays;

public class GradesInAnArrayAndAFile
{

	public static void main( String[] args ){
			
	Scanner scan = new Scanner(System.in);
	Random r = new Random();
	String name;
	String filename;

	System.out.print("Name (first last): ");
	name = scan.nextLine();
	System.out.print("Filename: ");
	filename = scan.nextLine();

	int[] grades = new int[5];
	
	System.out.println();
	
	System.out.println("Here are your randomly-selected grades (hope you pass):");
	
	for(int i = 0; i < grades.length; i++){
		grades[i] = 1 + r.nextInt(100);
		System.out.println("Grade " + (i+1) + ": " + grades[i]);
	}
	System.out.println();

	try{
	FileWriter writer = new FileWriter(filename.concat(".txt"));
	writer.write(name + "\n");
		for(int grade : grades){
				writer.write(grade + " ");
	}
	writer.close();
	}catch(Exception e){}

	System.out.println("Data saved in " + "\""+filename.concat(".txt")+"\"" + ".");
 }

}
