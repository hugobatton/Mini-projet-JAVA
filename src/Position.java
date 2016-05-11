public class Position 
{
	private final int x, y;
	
	public Position(int x0, int y0)
	
	{
		this.x=x0;
		this.y=y0;
	
	}
	
	
	public int getX()
	{
		return this.x;	
		
	}
	
	public int getY()
	{
		return this.y;	
	}
	
	

	public  Position getTranslatePosition(int deltarow, int deltacolumn)
	
	{
		return new Position(this.x+deltarow,this.y+deltacolumn);
	}
	

	@Override
	public String toString()
	{
		return "Position [row=" + x + ", column=" + y + "]";
	}
}




	

