import java.util.Scanner;

// TODO fix README.md (text encoding)
// DONE

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
		new LightsOutGame().play();
		
		
		
		
	}

}
