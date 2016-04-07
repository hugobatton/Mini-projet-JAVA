
/**
 * A 2D grid containing lamps
 * 
 *  x x x x
 *  o o x x 
 *  x o x o <- lamp at position(2,3) 
 *  o x o x
 * @author battonh
 *
 */
public class Grid 
{
	/**
	 * A two-dimensional matrix which contains lamp positions (x,y). Position (2,3) corresponds to lamps[2][3] 
	 */
	private Lamp[][] lamps;
	private final int largeur=4;
	private final int longueur=4;
	
	
	/**
	 * Creates a new 2D grid with randomly lit lamps
	 *  
	 */
	public Grid()
	{
		this.lamps = new Lamp[longueur][largeur];
	
	}

	public boolean isAtLeastOneLampLit() 
	{
		// TODO Auto-generated method stub
		return false;
	}


	public boolean isPositionValid(Position position) {
		// TODO Auto-generated method stub
		return false;
	}

	public void switchStateAround(Position position) {
		// TODO Auto-generated method stub
		
	}

	
	
	
}
