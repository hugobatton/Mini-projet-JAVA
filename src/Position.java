/**
 *  this class manages everything on a grid position
 *  A position is defined by two coordinated
 */

public class Position
{
	
	/**
	 * first coordinated of the position (x)
	 */
	private final int number_of_lines;
	
	/**
	 * second coordinated of a position (y)
	 */
	
	private final int number_of_columns;
	
	/**
	 * number of lines of the grid
	 */
	private final static int NB_LINES=4;
	
	/**
	 * number of columns of the grid
	 */
	private final static int NB_COLUMNS=4;
	
	
	
	/**
	 * Creates a new position(x,y)
	 * @param x0
	 * @param y0
	 */
	public Position(int x0, int y0) 
	
	{
		
			this.number_of_lines=x0;
			this.number_of_columns=y0;
		
	}
	
	
	
	/**
	 * Getter for the first coordinate of the position
	 * @return number_of_lines
	 */
	
	public int getNumberOfLines()
	{
		return this.number_of_lines;	
		
	}
	
	/**
	 * Getter for the second coordinate of the position
	 * @return number_of_columns
	 */
	public int getNumberOfColumns()
	{
		return this.number_of_columns;	
	}
	
	
	
	
	/**
	 * Getter for the number of lines of the grid
	 * @return NB_LINES
	 */
	
	public static int getNbLines() {
		return NB_LINES;
	}
	

	/**
	 * Getter for the number of the columns of the grid
	 * @return
	 */
	public static int getNbColumns() {
		return NB_COLUMNS;
	}

	
	
	
	/**
	 * Method that calculates a new position with a given delta
	 * @param deltarow
	 * @param deltacolumn
	 * @return new translated position
	 * @throws InvalidPositionException 
	 */

	public  Position getTranslatePosition(int deltarow, int deltacolumn) 
	
	{
		return new Position(this.number_of_lines+deltarow,this.number_of_columns+deltacolumn);
	}
	

	@Override
	public String toString()
	{
		return "Position [row=" + number_of_lines + ", column=" + number_of_columns + "]";
	}
}




	

