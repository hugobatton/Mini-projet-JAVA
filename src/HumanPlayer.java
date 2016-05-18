import java.util.Scanner;




public class HumanPlayer extends Player {
	
	private String name;
	
	
	public HumanPlayer(String name)
	{
		super(name);
	}
	
	public  Position askPosition(Grid grid)
	{
		int x,y;
		Scanner scanner =new Scanner(System.in);
		System.out.println("Please entry a x");
		x=scanner.nextInt();
		System.out.println("Please entry a y");
		y=scanner.nextInt();
		scanner.close();
		return new Position(x,y);
		
		
	}
}
