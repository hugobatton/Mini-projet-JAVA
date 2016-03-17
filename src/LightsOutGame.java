
/**
 * This class represents a Lightsout game. Follow the link to have the rules of
 * this game : https://en.wikipedia.org/wiki/Lights_Out_%28game%29
 * 
 * @author battonh
 * 
 */
public class LightsOutGame
{

	// TODO write comment
	private Grid grid;

	/**
	 * Creation of a new lightsout game ready to play (the grid contains
	 * randomly lit lamps)
	 */
	public LightsOutGame()
	{
		this.grid = new Grid();
	}

	// TODO detail algorithm (ask for advice)
	/**
	 * Play the game Ligthsout is a turn based strategy game(one player).
	 * 
	 * 
	 * 
	 * while all the lamp aren't off : we can continue begin a turn ( the number
	 * of turn isn't a constraint) if you click on a lamp , this lamp and the 4
	 * around swap their states if the player gives up , the game stops *
	 * 
	 */

	public void play()

	{

	}

}
