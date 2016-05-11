
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
	private boolean[][] stateOfLamps = new boolean[4][4];
	
	/**
	 * 
	 */
	
	
	private final static int NBR_LINES=3;
	
	private final static int NB_COLUMNS=4;
	private final static int NB_LINES=4;
	
	/**
	 * Creates a new 2D grid with randomly lit lamps
	 *  
	 */
	public Grid()
	{
		this.stateOfLamps = new boolean[NB_LINES][NB_COLUMNS];
		//this.lamp_position_around= new Position[NBR_LINES];
	
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
		
		Position [] lamp_position_around= new Position[3];
		
	
		if (isPositionValid(position)==true)
			
		{
			lamp_position_around[0] = position.getTranslatePosition(0, 1);
			lamp_position_around[1] = position.getTranslatePosition(-1, 0);
			lamp_position_around[2] = position.getTranslatePosition(0, -1);
			lamp_position_around[3] = position.getTranslatePosition(1, 0);
		}
		
		for (int i=0;i<3;i++)
		{
			if (isPositionValid(lamp_position_around[i])==true)
			{
				this.stateOfLamps[lamp_position_around[i].getX()][lamp_position_around[i].getY()] = !stateOfLamps[lamp_position_around[i].getX()][lamp_position_around[i].getY()];
			}
		}
		
		
			
		}
	
	
	public String toString()
	{
		StringBuilder represente= new StringBuilder(NB_LINES+NB_COLUMNS+1);
		for(int i=0; i<NB_LINES;i++)
		{
			for(int j=0; j<NB_COLUMNS; j++)
			{
				represente.append(stateOfLamps[i][j]);
			}
			represente.append("\n");
		}
		return represente.toString();
	}

      
}
