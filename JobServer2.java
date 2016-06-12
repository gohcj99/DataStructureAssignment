
public class JobServer2 {

	static int JobDone;
	static int JobDone1Pass;
	static int JobDone2Pass;
	static int JobDone3Pass;
	
	
	
	static JobClass JobClass;
	
	
	static int ServerStatus2;
	
	static JobClass JobID;
	
	static int BurstTime;
	
	static String JobIDdone = "";
	
	public JobServer2 (JobClass JobClass){
		
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
