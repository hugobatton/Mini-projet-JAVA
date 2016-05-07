public class Position 
{
	private final int x, y;
	private int x1,y1;
	private Position translated_position;
	
	
	
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
	
	
	
	public Position TranslatePosition(int xi , int yi)
	
	{
		this.x1=x+xi;
		this.y1=y+yi;
		this.translated_position= new Position (x1,y1);
		return translated_position;
		
		
	}
	
	public int getX1()
	{
		return this.x1;
	}
	
	public int getY1 ()
	{
		return this.y1;
	}
	
}
