public class Position 
{
	private final int x, y;
	private int x1,y1;
	
	
	
	
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
		return new Position(x1=this.x+deltarow,y1=this.y+deltacolumn);
	}
	
	public int GetY_Translate()
	{
		return this.y1;
	}
	
	public int GetX_Translate()
	{
		return this.x1;
	}
	
}




	

