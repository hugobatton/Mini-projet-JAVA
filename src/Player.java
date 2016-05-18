import java.util.Random;

/**
 * This class permits to interact with the player
 */
public abstract class Player {


	private String name;
	
	public Player(String name)
	
	{
		this.name=name;
	}
	
	public abstract Position askPosition(Grid grid);
	
}


