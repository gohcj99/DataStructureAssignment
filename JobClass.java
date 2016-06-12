
public class JobClass implements Comparable<JobClass>, java.io.Serializable  {
	
	private String ServerID;
	private int JobID;
	private int ArriveTime;
	private int ProccessRound;
	private int BurstTime;
	
	public JobClass(){
		
	}
	
	public JobClass (int JobID, int ArriveTime, int ProcessRound, String ServerID, int BurstTime){ // Constructor for JobClass
		
		
		
		this.ServerID= ServerID;
		this.JobID = JobID;
		this.ArriveTime=ArriveTime;
		this.ProccessRound=ProcessRound;
		this.BurstTime=BurstTime;
		
	}
	
	public void setJobID(int JobID){
		this.JobID=JobID;
	}
	public int getjobID(){
		return JobID;
	}
	public void setArriveTime(int ArriveTime){
		this.ArriveTime=ArriveTime;
	}
	public int getArriveTime(){
		return ArriveTime;
	}
	public void setProcessRound(int ProcessRound){
		this.ProccessRound=ProcessRound;
	}
	public int getProcessRound(){
		return ProccessRound;
	}
	public void setServerID(String ServerID){
		this.ServerID=ServerID;
	}
	public String getServerID(){
		return ServerID;
	}
	
	public void setBurstTime(int BurstTime){
		this.BurstTime=BurstTime;
	}
	
	public void increaseProcessRound(){
		ProccessRound++;
	}
	
	public int getBurstTime(){
		return BurstTime;
	}
	
	// Priority Queue Code
	
	public boolean compareToo(JobClass others){
		
		return this.getBurstTime() == others.getBurstTime();
	}
	
	public int compareTo(JobClass others){
		
		if(this.equals(others))
			return 0;
		
		else if (getBurstTime()> others.getBurstTime())
			return 1;
		else
			return-1;
	}
	
	// < = Higher first.
	
}


	
	
	

