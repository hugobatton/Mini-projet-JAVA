import java.util.Scanner;


/**
 * This class represent the interaction between the grid and a real player.
 * @author battonh
 *
 */

public class HumanPlayer extends Player {
	
	
	/**
	 * A Scanner type variable in order that player can grasp the informations asked.
	 */
	
	private Scanner scanner;
	
	/**
	 * Definition of a human player.
	 * @param name
	 */
	
	public HumanPlayer(String name)
	{
		super(name);
		 this.scanner = new Scanner(System.in);
	}
	
	/**
	 * This method permits to the player to interact with grid play.
	 * @throws InvalidPositionException 
	 */
	
	public  Position askPosition(Grid grid) 
	{
		int number_of_line;
		int number_of_column;
		
		System.out.println("Please entry a number_of_line :");
		number_of_line=scanner.nextInt();
		System.out.println("Please entry a number_of_column :");
		number_of_column=scanner.nextInt();
		
		
		
		return new Position(number_of_line,number_of_column);
	
	}
}
