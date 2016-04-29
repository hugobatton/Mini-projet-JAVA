
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
	private boolean[][] stateOfLamps;
	
	
	
	private final static int NB_COLUMNS=4;
	private final static int NB_LINES=4;
	
	/**
	 * Creates a new 2D grid with randomly lit lamps
	 *  
	 */
	public Grid()
	{
		this.stateOfLamps = new boolean[NB_LINES][NB_COLUMNS];
	
	}
	
	
	/**
	 * isAtLeastOneLampLit is a method that return true if there is at list one lamp lit, else it returns false 
	 */

	public boolean isAtLeastOneLampLit() 
	{
		for (int i=0;i<NB_LINES;i++)
			for (int j=0;j<NB_COLUMNS;j++)
				if (stateOfLamps[i][j]==true) return true;
		return false;
		
		
		
	}

/**
 * isPositionValid is a method that checks if there is a lamp where we ask.
 */
	public boolean isPositionValid(Position position) {
		// TODO Auto-generated method stub
		
			if (position.getX()>NB_COLUMNS && position.getX()<0)
			{
				System.out.println("position invalide");
				return false;
			}
			if (position.getY()>NB_LINES && position.getY()<0)
			{
				System.out.println("position invalide");
				return false;
			}
			
			return true;	
			
	}	
	
	/**
	 * switchStateAround is a method that changes the state of the four lamps around a position
	 */

	public void switchStateAround(Position position)
	{
		if(isPositionValid(position.getX()-1, position.getY())==true)
		{
		stateOfLamps[(position.getX())-1][position.getY()] = ! stateOfLamps[position.getX()-1][position.getY()];
		}
		stateOfLamps[(position.getX())+1][position.getY()] = ! stateOfLamps[position.getX()+1][position.getY()];
		stateOfLamps[(position.getX())][position.getY()-1] = ! stateOfLamps[position.getX()][position.getY()-1];
		stateOfLamps[(position.getX())][position.getY()+1] = ! stateOfLamps[position.getX()][position.getY()+1];
	}


	
	
}
