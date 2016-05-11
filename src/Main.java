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
		Grid grid= new Grid();
		System.out.println(grid);
		new LightsOutGame().play();
		
		
	}

}
