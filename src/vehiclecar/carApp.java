package vehiclecar;

import java.util.Scanner;

public class carApp {

static Vehicle car;

	public static void main(String[] args) {
		
	Car C = new Car ("Red Porshe", "Starting", "on emission", "accelerate", 100, "Stoping", 2, 4);
	Car C1 = new Car ("Blue jetha", "Starting", "not emisson", "accelerate", 500, "Stoping", 2, 4);
	System.out.println(C.toString());
	System.out.println(C1.toString());
	if (C.getSpeed()> C1.getSpeed())
	{
		System.out.println("Proshe just passed Limo");
	}
	else if (C.getSpeed() == C1.getSpeed())
	{
		System.out.println("Both car are togther");
		
	}
	else if (C.getSpeed() < C1.getSpeed())
	{
		System.out.println("Limo passed the porche");
	}
	
	
	
//	}
	

}
}
