import java.util.ArrayList;

public class SolarSystem 
{
	//Declaration of variables
	//The ArrayList that holds the planet data
	private ArrayList<Planet> planets = new ArrayList<>();
	private String nameOfSystem;
	//The setter and getter for the Solar Systems name
	public SolarSystem(String nameOfSystem)
	{
		this.nameOfSystem = nameOfSystem;
	}
	
	public String getName()
	{
		return nameOfSystem;
	}
	
	// This method creates the new planet input by the user and adds it to the array list
	public void addPlanet(String nameOfPlanet,double mass,double distance)
	{
		Planet newPlanet = new Planet(nameOfPlanet,mass,distance);
		planets.add(newPlanet);
	}
	
	public void addPlanet(Planet newPlanet)
	{
		planets.add(newPlanet);
	}
	
	//The method responsible for printing out the table of planet details
	public void printTable()
	{
		System.out.println("Name\tMass\tDistance\tPeriod (Years)");
		for(Planet i:planets)
		{
			System.out.println(i.getNameOfPlanet()+"\t" + i.getDistance()+"\t" + i.getMass()+"\t\t" + i.getPeriod());
		}
	}
	
	//the method responsible for returning the data for each planet in the array list
	public String toString()
	{
		String planetData = nameOfSystem+"\n";
		for(Planet i:planets)
		{
			planetData += i.toString()+"\n";
		}
		return planetData;
	}
}
