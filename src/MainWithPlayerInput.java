import java.util.Scanner;


public class MainWithPlayerInput {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
	
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter your name");
		String name=scanner.nextLine();
		new LightsOutGame(name).play();

		
		
		
	}

}
