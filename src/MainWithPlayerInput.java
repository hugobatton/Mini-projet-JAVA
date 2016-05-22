import java.util.Scanner;
/**
 * this class permits to a real player to interact with the grid
 * @author Hugo
 *
 */

public class MainWithPlayerInput {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
	
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter your name");
		String name=scanner.nextLine();
		new LightsOutGame(name).play();

		
		
		
	}

}
