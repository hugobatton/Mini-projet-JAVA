
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
	
	/**
	 * Creation of a game grid
	 */
	
	private Grid grid;
	private Lamp lamp;

	/**
	 * Creation of a new lightsout game ready to play (the grid contains
	 * randomly lit lamps)
	 */
	public LightsOutGame()
	{
		this.grid = new Grid();
		this.player= new Player();
		this.lamp=new Lamp();
	}
	
	
	public Player player;
	
	
	
	// TODO detail algorithm (ask for advice)
	/**
	 * Play the game Ligthsout is a turn based strategy game(one player).
	 * 
	 * 
	 * 
	 * while <all the lamps aren't off> 
	 * 	do
	 * 		<ask the player which position to switch>
	 * 	while (<position is not valid>)
	 * 	<switch the lamp at this position and its neighnours>
	 * 
	 */

	public void play()

	{

		while (this.grid.isAtLeastOneLampLit())
				do
					this.player.AskPosition();
			
				while (this.grid.isPositionValid(position))
					do 
						this.lamp.SwitchStateOfLamp();
				
					
			
						
		
	}

}
