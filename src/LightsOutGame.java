/**
 * This class represents a Lightsout game. Follow the link to have the rules of
 * this game : https://en.wikipedia.org/wiki/Lights_Out_%28game%29
 * 
 * @author battonh
 * 
 */
public class LightsOutGame {

	// TODO write comment
	// DONE

	/**
	 * Creation of a game grid
	 */

	private Grid grid;
	private Lamp lamp;

	/**
	 * Creation of a new lightsout game ready to play (the grid contains
	 * randomly lit lamps)
	 */

	public LightsOutGame() {
		this.grid = new Grid();
		this.player = new Player();
		this.lamp = new Lamp();
	}

	/**
	 * Creation of a player
	 */

	public Player player;

	/**
	 * Play the game Ligthsout is a turn based strategy game(one player).
	 * 
	 * 
	 * 
	 * while <all the lamps aren't off> 
	 * do 
	 *   <ask the player which position to switch> 
	 * while (<position is not valid>) 
	 * <switch the lamp at this position and its neighbours>
	 * 
	 */

	public void play()

	{

		Position position = null;

		while (this.grid.isAtLeastOneLampLit()) {
			do
				position = this.player.askPosition();

			while (this.grid.isPositionValid(position));

			this.switchStateAround(position);
		}

	}

	private void switchStateAround(Position position) {
		// TODO Auto-generated method stub

	}

}
