public class Position 
{
	private final int number_of_lines, number_of_columns;
	
	public Position(int x0, int y0)
	
	{
		this.number_of_lines=x0;
		this.number_of_columns=y0;
	
	}
	
	
	public int getX()
	{
		return this.number_of_lines;	
		
	}
	
	public int getY()
	{
		return this.number_of_columns;	
	}
	
	

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




	

