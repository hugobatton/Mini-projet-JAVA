
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
	private final int nbcolonnes=4;
	private final int nblignes=4;
	
	private int i=0;
	private int j=0;
	
	
	/**
	 * Creates a new 2D grid with randomly lit lamps
	 *  
	 */
	public Grid()
	{
		this.lamps = new Lamp[nblignes][nbcolonnes];
	
	}

	public boolean isAtLeastOneLampLit() 
	{
		for (int i=0;i<5;i++)
			for (int j=0;i<5;i++)
				if (lamps[i][j].stateoflamp) return true;
		return false;
		
		
		
	}

/**
 * isPositionValid is a method that checks if there is a lamp where we ask.
 */
	public boolean isPositionValid(Position position) {
		// TODO Auto-generated method stub
		
			if (position.x>nbcolonnes && position.x<0)
			{
				System.out.println("position invalide");
				return false;
			}
			if (position.y>nblignes && position.y<0)
			{
				System.out.println("position invalide");
				return false;
			}
			
			return true;	
			
	}	

	public void switchStateAround(Position position) {
		// TODO Auto-generated method stub
		
	}

	
	
	
}
