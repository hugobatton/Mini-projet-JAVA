import java.util.Random;


public class IAPlayer extends Player {
	private static final String DEFAULT_NAME = "IAPlayer";
	private Random random;
	 
	public IAPlayer()
	{
		super(DEFAULT_NAME);
		this.random=new Random();
	}
	
	public Position askPosition(Grid grid)
	{
		
		return new Position(this.random.nextInt(Position.getNbColumns()) ,this.random.nextInt(Position.getNbLines()));
	}
}
