/**
 *  this class manages everything on a grid position
 */

public class Position
{
	private final int number_of_lines;
	private final int number_of_columns;
	
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
	
	public int getX()
	{
		return this.number_of_lines;	
		
	}
	
	
	/**
	 * Getter for the second coordinate of the position
	 * @return number_of_columns
	 */
	public int getY()
	{
		return this.number_of_columns;	
	}
	
	/**
	 * Method that calculates a new position with a given delta
	 * @param deltarow
	 * @param deltacolumn
	 * @return new translated position
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




	

