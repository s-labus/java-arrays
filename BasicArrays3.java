// Straxinja - 5/2020
import java.util.Random;

public class BasicArrays3
{

	public static void main( String[] args ){
	
	Random r = new Random();
	int[] numero = new int[1000];

	for(int i = 0; i < numero.length; i++){
		numero[i] = 10 + r.nextInt(89);
		System.out.print(numero[i] + "  ");
	}
	System.out.println();
	
	}

}
