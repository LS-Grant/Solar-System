/* Student number: 914103
 Feedback from last assignment about my comments "they don't always align with the code though"
 I've addressed this issue and I can see where I went wrong in Nim.java this time I've correctly
 alligned all of my comments with the code that they comment on.
 In general I feel as though the quality of my code has been improved, in layout mainly because of how classes
 work, there isn't a huge wall of text on the screen like there was in Nim.
 */
import java.util.Scanner;
import java.util.Random;

public class FantasySolarSystem 
{	
	//Declaration of Constants
	//Multiplies the randomly generated number
	private static final int RANDOM_MULTIPLIER = 10;
	private static final String INPUT_NAME_SS = "Enter the name of the solar system: ";
	private static final String INPUT_NAME_P = "Now enter planet names - type 'done' to finish";	
	
	public static void main(String[] args) 
	{
		//Declaration of Variables
		Scanner input = new Scanner(System.in);
		boolean run = true;
		Random uniqueNo = new Random();
		
		//User inputs the details of the Solar System they are creating
		System.out.print(INPUT_NAME_SS);
		SolarSystem newSystem = new SolarSystem(input.nextLine());
		System.out.println(newSystem);
		
		// This loop checks to see if the user has input "done" instead of a planet name
		while(run)
		{
			System.out.println(INPUT_NAME_P);
			//This variable checks to see if "done" is input
			String doneCheck = input.nextLine();
			if (doneCheck.equalsIgnoreCase("done"))
			{
				run = false;
			}
			else
			{
				//Generates the random properties of the planet and prints them
				Planet newPlanet = new Planet(doneCheck, uniqueNo.nextDouble()*RANDOM_MULTIPLIER, uniqueNo.nextDouble()*RANDOM_MULTIPLIER);
				newSystem.addPlanet(newPlanet);
				System.out.println(newPlanet.toString());
			}
		}
		//Displays planets details in a table
		newSystem.printTable();
		input.close();
	}
}
