
public class JobServer {

	static int JobDone;               // Total Job done by Server 1.
	static int JobDone1Pass;		  // Job done with one pass by Server 1.
	static int JobDone2Pass;		  // Job done with two pass by Server 1.	
	static int JobDone3Pass;		  // Job done with three pass by Server 1.
	
	static String JobIDdone="";
	
	
	static JobClass JobClass;         // Class type to receive Job informations.
	
	static int ServerStatus;		  // Server 1 Status. [1=Processing Job, 0=Available to process Job]
	
	static JobClass JobID;			 
	
	static int BurstTime;			 // Burst time of Server 1.
	
	
	public JobServer (JobClass JobClass){
		
		this.JobClass=JobClass;
		
	}
	
	public JobClass returnClass() {
		
		return JobClass;
		
	}
	

	
//    static public int getBurstTime(){
//    	
//    	return RemainingTime;
//    	
//    }
	
	
	
	
	
}
