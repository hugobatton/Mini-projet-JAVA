import java.util.Scanner;




public class HumanPlayer extends Player {
	
	private String name;
	
	private Scanner scanner;
	
	
	public HumanPlayer(String name)
	{
		super(name);
		 this.scanner = new Scanner(System.in);
	}
	
	public  Position askPosition(Grid grid)
	{
		int number_of_line;
		int number_of_column;
		
		System.out.println("Please entry a number_of_line :");
		number_of_line=scanner.nextInt();
		System.out.println("Please entry a number_of_column :");
		number_of_column=scanner.nextInt();
		return new Position(number_of_column,number_of_line);
	
	}
}
