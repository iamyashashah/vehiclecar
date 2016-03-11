package vehiclecar;

public abstract class Vehicle {
	private String name;
	private String Start;
	private String accelerate;
	private long speed;
	private String stop;
	
	
	
	public Vehicle(String name,String Start, String accelerate, long speed, String stop) {
		
		this.name=name;
		this.Start=Start;
		this.accelerate=accelerate;
		this.speed=speed;
		this.stop=stop;
	}
	public Vehicle()
	{
		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getStart() {
		return Start;
	}
	public void setStart(String Start) {
		this.Start = Start ;
	}
	public String getAccelerate() {
		return accelerate;
	}
	public void setAccelerate(String accelerate) {
		this.accelerate = accelerate;
	}
	public long getSpeed() {
		return speed;
	}
	public void setSpeed(long speed) {
		this.speed = speed;
	}
	public String getStop() {
		return stop;
	}
	public void setStop(String stop) {
		this.stop = stop;
	
	}
	
//	public String toString() {
//		return "the Porshe is:" + getStart() + "the Porshe can:" + getAccelerate() + "the Porshe speed is:" + getSpeed() + "The  Porshe speed:" + getStop();
//	}

}
