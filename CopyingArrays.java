// Straxinja - 5/2020
import java.util.Random;

public class CopyingArrays
{

	public static void main( String[] args ){
			
	Random r = new Random();		
	int[] numero = new int[10];
	int[] numero2 = new int[10];
	
	for(int i = 0; i < numero.length; i++){
		numero[i] = 1 + r.nextInt(99);
		numero2[i] = numero[i];		
		if(i == 0){System.out.print("Array 1: ");}
		numero[numero.length-1] = -7;		
		System.out.print(numero[i] + " ");
	}
	System.out.println();

	for(int i = 0; i < numero2.length; i++){
		if(i == 0){System.out.print("Array 2: ");}
		System.out.print(numero2[i] + " ");
	}	
	System.out.println();

 }

}
