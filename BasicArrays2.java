// Straxinja - 5/2020
import java.util.Random;
public class BasicArrays2
{

	public static void main( String[] args ){
	
		Random r = new Random();

		int[] numero = new int[10];

		for(int i = 0; i < numero.length; i++){
			numero[i] = 1 + r.nextInt(100);		
			System.out.println("Slot " + i + " contains a " + numero[i]);
		}

	}

}
