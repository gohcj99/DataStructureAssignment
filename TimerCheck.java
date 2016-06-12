
public class TimerCheck {

	static int Server1Remain; // Server 1 remaining processing time.
	
	static int Server2Remain; // Server 2 remaining processing time.
	
	static int time;		  // Current simulation time.
	
	static int duration = 360;  // Process/Simulation duration.
	
	static Double durationMinute =  ((double) duration/60); // Process/Simulation duration in minutes.
	
	static int JobGenerated;  // Variable to store total job generated
	
	
	public void TimerAdd(){ // Method to add current time +1 , simulating one second had passed.
		
		time++;
	}
	
	
	
	
}
