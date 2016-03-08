/**
 * this class define a Lamp by 2 details and one boolean which inform on its state.
 *
 */



public class Lamp {
	
	/**
	 * first detail of lamp on the grid 
	 */
	
	
	private int x; 

	/**
	 * second detail of lamp on the grid 
	 */
	
	private int y;
	

	/**
	 * The following boolean is true when the lamp is on and false when the lamp is off
	 */
	
	private boolean ESTALLUME;
	
	
	/**
	 * This constructor permit to create a lamp with its details and its state
	 * @param x
	 * @param y
	 * @param ESTALLUME
	 */
	public Lamp (int x , int y, boolean ESTALLUME )
	
	{
		
		this.x=x;
		this.y=y;
		this.ESTALLUME=ESTALLUME;
		
	}
	
	

}
