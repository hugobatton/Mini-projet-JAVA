import java.util.Random;


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
	
	/**
	 * This is a constant that represents the numbers of columns of the grid
	 */
	
	private final static int NB_COLUMNS=4;
	
	/**
	 * This is a constant that represents the numbers of lines of the grid
	 */
	
	
	private final static int NB_LINES=4;
	
	/**
	 * Creates a new 2D grid with randomly lit lamps
	 *  
	 */
	public Grid()
	{
		this.stateOfLamps = new boolean[NB_LINES][NB_COLUMNS];
		Random random= new Random();
		for (int i=0;i<NB_LINES;i++)
			for (int j=0;j<NB_COLUMNS;j++)
				this.stateOfLamps[i][j]= random.nextBoolean();
		
	}
	
	
	
	
	
	
	
	/**
	 * isAtLeastOneLampLit is a method that return true if there is at list one lamp lit, else it returns false 
	 * @return true if there is at least one lamp lit , else false
	 */

	public boolean isAtLeastOneLampLit() 
	{
		for (int i=0;i<NB_LINES;i++)
			for (int j=0;j<NB_COLUMNS;j++)
				if (stateOfLamps[i][j]) return true;
		return false;
		
		
		
	}
	

/**
 * isPositionValid is a method that checks if there is a lamp where we ask.
 * @param position 
 * @return True if the position is valid , else returns false
 */
	public boolean isPositionValid(Position position) {
		// TODO Auto-generated method stub
		
			if (position.getX()>=NB_COLUMNS || position.getX()<0)
			{
				//System.out.println("position invalide");
				return false;
			}
			if (position.getY()>=NB_LINES || position.getY()<0)
			{
				//System.out.println("position invalide");
				return false;
			}
			
			return true;	
			
	}	
	
	/**
	 * switchStateAround is a method that changes the state of the four lamps around a position
	 * @param position 
	 */
	public void switchStateAround(Position position)
	{
		
		Position [] lamp_position_around= new Position[4];
		
	
		if (isPositionValid(position))
			
		{
			lamp_position_around[0] = position.getTranslatePosition(0, 1);
			lamp_position_around[1] = position.getTranslatePosition(-1, 0);
			lamp_position_around[2] = position.getTranslatePosition(0, -1);
			lamp_position_around[3] = position.getTranslatePosition(1, 0);
		}
		
		for (int i=0;i<4;i++)
		{
			if (isPositionValid(lamp_position_around[i]))
			{
				this.stateOfLamps[lamp_position_around[i].getX()][lamp_position_around[i].getY()] = !stateOfLamps[lamp_position_around[i].getX()][lamp_position_around[i].getY()];
			}
		}
		
		stateOfLamps[position.getX()][position.getY()] = (stateOfLamps[position.getX()][position.getY()] == false) ? true : false;
		
		
			
		}
	
	
	
	/**
	 * This is the redefinition of the toString method in order to trace it on the monitor.
	 */
	
	
	public String toString()
	{
		StringBuilder represente= new StringBuilder(NB_LINES+NB_COLUMNS+1);
		for(int i=0; i<NB_LINES;i++)
		{
			for(int j=0; j<NB_COLUMNS; j++)
			{
				represente.append(stateOfLamps[i][j]);
				represente.append("\t");
				
			}
			represente.append("\n");
		}
		return represente.toString();
	}
	

	/**
	 * Getter that returns the numbers of columns of the grid
	 * @return NB_COLUMNS
	 */
	public static int getNbColumns() {
		return NB_COLUMNS;
	}
	
	
	
/**
 * Getter that returns the numbers of lines of the grid
 * @return NB_LINES
 */

	public static int getNbLines() {
		return NB_LINES;
	}

      
}
