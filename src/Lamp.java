
public class Lamp {

	public boolean stateoflamp;
	
	public Lamp ()
	{
		this.stateoflamp=true;
		
	}
	
	public void SwitchStateOfLamp()
	{
		if (stateoflamp==false){
			stateoflamp=true;
		}
		else stateoflamp=false;
	}


}
