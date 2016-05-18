import java.util.Scanner;

// TODO fix README.md (text encoding)
// DONE
//Ceci importe la classe Scanner du package java.util
import java.util.Scanner; 
//Ceci importe toutes les classes du package java.util
import java.util.*;

/**
 * Application that launches a LightsOutGame
 */

public class Main
{

	/**
	 * Application's main
	 * 
	 * @param args
	 *            command-line arguments (unused)
	 */
	public static void main(String[] args)
	{
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter your name");
		String name=scanner.nextLine();
		Grid grid= new Grid();
		
		
		
		System.out.println(grid);
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez saisir votre nom :");
		String str = sc.nextLine();  
		System.out.println("Joueur : " + str);
		new LightsOutGame().play();

		

		
		
		
		
		
	}

}
