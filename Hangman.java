// Straxinja - 5/2020

import java.util.Scanner;
import java.util.Random;
public class Hangman
{

	public static void main( String[] args ){
	Scanner scan = new Scanner(System.in);
	Random rnd = new Random();
	int secret;
	String[] words = {"Leviathan", "Polaris", "Aurora"};

	secret = 1 + rnd.nextInt(2);
	String counter = words[secret];

	System.out.print("Word: ");
	for(int i = 0; i <= counter.length(); i++){
		System.out.print("_ ");
	}
	System.out.println();
 }

}
