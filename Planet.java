
public class Planet 
{
	//Declaration of constants and variables
	private double period;
	private double distance;
	private double mass;
	private String nameOfPlanet;
	//this constant sets the decimal place (3 D.P) of the calculations used to get Mass,distance and period
	private static final double TO_DECIMAL_PLACE = 1000;
	
	public Planet(String nameOfPlanet,double mass,double distance)
	{
		this.nameOfPlanet = nameOfPlanet;
		this.mass = Math.round(mass*TO_DECIMAL_PLACE)/TO_DECIMAL_PLACE;
		this.distance = Math.round(distance*TO_DECIMAL_PLACE)/TO_DECIMAL_PLACE;
		this.period = Math.round(Math.sqrt(distance*distance*distance)*TO_DECIMAL_PLACE)/TO_DECIMAL_PLACE;
	}
	
	//Below are the setters and getters of all the planet properties
	public double getDistance() 
	{
		return distance;
	}

	public double getPeriod() 
	{
		return period;
	}
	
	//Since period is derived from distance i've put them in the same set method
	public void setDistance(double distance) 
	{
		this.distance = distance;
		this.period = Math.round(Math.sqrt(distance*distance*distance)*TO_DECIMAL_PLACE)/TO_DECIMAL_PLACE;
	}

	public double getMass() 
	{
		return mass;
	}

	public void setMass(double mass) 
	{
		this.mass = mass;
	}

	public String getNameOfPlanet() 
	{
		return nameOfPlanet;
	}

	public void setNameOfPlanet(String nameOfPlanet) 
	{
		this.nameOfPlanet = nameOfPlanet;
	}
	
	//Returns the details of the randomly generated planet to the user.
	public String toString()
	{
		return "Planet "+nameOfPlanet+" has a mass of " +mass+ " Earths, is "+distance+"AU from its star, and orbits in "+period+" years";
	}
}
