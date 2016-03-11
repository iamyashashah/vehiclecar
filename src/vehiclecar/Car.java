package vehiclecar;

public class Car extends Vehicle {
	
	private int numDoors;
	private int numWheels;
	private String emission;
	
	
	


	public Car (String name, String Start, String emission, String accelerate, long speed, String stop, int numDoors, int numWheels)
	{
		super(name, Start, accelerate, speed, stop);
		this.numDoors=numDoors;
		this.numWheels=numWheels;
		this.emission = emission;
	}
	
	public Car()
	{
		
	}

	public int getNumDoors() {
		return numDoors;
	}

	public void setNumDoors(int numDoors) {
		this.numDoors = numDoors;
	}

	public int getNumWheels() {
		return numWheels;
	}

	public void setNumWheels(int numWheels) {
		this.numWheels = numWheels;
	}
	
	public String getEmission() {
		return emission;
	}

	public void setEmission(String emission) {
		this.emission = emission;
	}
	
	public String toString()
	{
		return ("Number of doors:" + getNumDoors()+ "\n" + "Number of wheels:" + getNumWheels() + "\n" + "The" + getName() + getEmission() + "\n" + "the " + getName() + " is:" + getStart()+ "\n" + "the" + getName() + "can:" + getAccelerate()+ "\n" + "the" + getName() + "speed is:" + getSpeed()+ "\n" + "The" +  getName() + "can:" + getStop()+ "\n");
		
	}
//	public String limoString()
//	{
//		return ("Number of doors:" + getNumDoors()+ "\n" + "Number of wheels:" + getNumWheels() + "\n" + "the Limo is:" + getStart()+ "\n" + "the Limo can:" + getAccelerate()+ "\n" + "the Limo speed is:" + getSpeed()+ "\n" + "The  Limo speed:" + getStop()+ "\n");
//	}
//	
	
	

}
