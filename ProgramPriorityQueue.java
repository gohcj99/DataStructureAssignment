import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import java.util.PriorityQueue;




public class ProgramPriorityQueue {
	

	public static void main(String[] args) {
		
		Timer SystemClock = new Timer(); // Create the system clock.
		
		TimerCheck TimerCheck = new TimerCheck(); // Create the timer checker class which will handle timing check operations.
		
		PriorityQueue<JobClass> ProcessLists= new PriorityQueue<JobClass>(); // Create an Priority Queue for the Job Queue.
		
		//Create JFrame classes for GUI display.
		

		
		JFrame frame = new JFrame();
		frame.setSize(600,600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Data Structure Assignment (PriorityQueue)");
		frame.setLocationRelativeTo(null);
		
		
		JPanel panel = new JPanel();
		JLabel label = new JLabel();
		JLabel label2 = new JLabel();
		JLabel label3 = new JLabel();
		JLabel label4 = new JLabel();
		JLabel label5 = new JLabel();
		JLabel label6 = new JLabel();
		JLabel label7 = new JLabel();
		JLabel label8 = new JLabel();
		JLabel label9 = new JLabel();
		JLabel label10 = new JLabel();
		JLabel label11 = new JLabel();
		JLabel label12 = new JLabel();
		JLabel label13 = new JLabel();
		JLabel label14 = new JLabel();
		JLabel label15 = new JLabel();
		JLabel label16 = new JLabel();
		JLabel label17 = new JLabel();
		JLabel label18 = new JLabel();
		JLabel label19 = new JLabel();
		JLabel label20 = new JLabel();
		JLabel label21 = new JLabel();
		JLabel label22 = new JLabel();
		JLabel label23 = new JLabel();
		JLabel label24 = new JLabel();
		JLabel label25 = new JLabel();
		JLabel label26 = new JLabel();
		JLabel label27 = new JLabel();
		JLabel label28 = new JLabel();
		JLabel label29 = new JLabel();
		JLabel label30 = new JLabel();
		JLabel label31 = new JLabel();
		JLabel label32 = new JLabel();
		JLabel label33 = new JLabel();
		JLabel label34 = new JLabel();
		JLabel label35 = new JLabel();
		JLabel label36 = new JLabel();
		JLabel label37 = new JLabel();
		JLabel label38 = new JLabel();
		JLabel label39 = new JLabel();
		JLabel label40 = new JLabel();
		JLabel label41 = new JLabel();
		JLabel label42 = new JLabel();
		JLabel label43 = new JLabel();
		JLabel label44 = new JLabel();
		JLabel label45 = new JLabel();
		
		
		panel.setLayout(new GridLayout(0,1,0,0));
		
		panel.add(label);
		frame.getContentPane().add(panel);
		
		panel.add(label2);
		frame.getContentPane().add(panel);
		
		panel.add(label3);
		frame.getContentPane().add(panel);
		
		panel.add(label4);
		frame.getContentPane().add(panel);
		
		panel.add(label5);
		frame.getContentPane().add(panel);
		
		panel.add(label6);
		frame.getContentPane().add(panel);
		
		panel.add(label7);
		frame.getContentPane().add(panel);
		
		panel.add(label8);
		frame.getContentPane().add(panel);
		
		panel.add(label9);
		frame.getContentPane().add(panel);
		
		panel.add(label10);
		frame.getContentPane().add(panel);
		
		panel.add(label11);
		frame.getContentPane().add(panel);
		
		panel.add(label12);
		frame.getContentPane().add(panel);
		
		panel.add(label13);
		frame.getContentPane().add(panel);
		
		panel.add(label14);
		frame.getContentPane().add(panel);
		
		panel.add(label15);
		frame.getContentPane().add(panel);
		
		panel.add(label16);
		frame.getContentPane().add(panel);

		panel.add(label17);
		frame.getContentPane().add(panel);

		panel.add(label18);
		frame.getContentPane().add(panel);
		
		panel.add(label19);
		frame.getContentPane().add(panel);
		
		panel.add(label20);
		frame.getContentPane().add(panel);
		
		panel.add(label21);
		frame.getContentPane().add(panel);
		
		panel.add(label22);
		frame.getContentPane().add(panel);
		
		panel.add(label23);
		frame.getContentPane().add(panel);
		
		panel.add(label24);
		frame.getContentPane().add(panel);
		
		panel.add(label25);
		frame.getContentPane().add(panel);
		
		panel.add(label26);
		frame.getContentPane().add(panel);
		
		panel.add(label27);
		frame.getContentPane().add(panel);
		
		panel.add(label28);
		frame.getContentPane().add(panel);
		
		panel.add(label29);
		frame.getContentPane().add(panel);
		
		panel.add(label30);
		frame.getContentPane().add(panel);
		
		panel.add(label31);
		frame.getContentPane().add(panel);
		
		panel.add(label32);
		frame.getContentPane().add(panel);

		panel.add(label33);
		frame.getContentPane().add(panel);

		panel.add(label34);
		frame.getContentPane().add(panel);
		
		panel.add(label35);
		frame.getContentPane().add(panel);
		
		panel.add(label36);
		frame.getContentPane().add(panel);
		
		panel.add(label37);
		frame.getContentPane().add(panel);
		
		panel.add(label38);
		frame.getContentPane().add(panel);
		
		panel.add(label39);
		frame.getContentPane().add(panel);
		
		panel.add(label40);
		frame.getContentPane().add(panel);
		
		panel.add(label41);
		frame.getContentPane().add(panel);
		
		panel.add(label42);
		frame.getContentPane().add(panel);
		
		panel.add(label43);
		frame.getContentPane().add(panel);
		
		panel.add(label44);
		frame.getContentPane().add(panel);
		
		panel.add(label45);
		frame.getContentPane().add(panel);
		
		label7.setText(" ");
		label3.setText(" ");
		
		//END of Creating JFrame classes for GUI display.
		
		
		SystemClock.scheduleAtFixedRate(
				
			    new TimerTask() // Program is created under a time limit.
			    {
			    	
			    	int Server1Status = 1; // Initial Status of Server 1 and Server 2
			    	int Server2Status = 1;
			    	
			    	int ReleaseTime;       // Initialize the variable of the Job release time for Server 1 and Server 2.
			    	int ReleaseTime2;
			    	
			    	
			    	
			    	 public void run(){   // Run the Program.
				        
 
			    		 TimerCheck.TimerAdd(); // Simulating one second had pass by adding a value of one to the timer.
			    		 	
			    		 label.setText("Current Time: "+TimerCheck.time); // JPanel display of current time.
			    		 
			    		 label6.setText(" ");
			    			
			    		 label10.setText(" ");
			    		 
			    		 System.out.println("Time now is: "+TimerCheck.time); // Print out current time.
			    		 
			    		 		int RandomTimer =BurstTimeGenerator.Generate(5,18);
			    		 		
			    		 		//if (TimerCheck.time<12 || (TimerCheck.time)%RandomTimer==0 ){
			    		 		
			    		 		
			    		 		
			    		 		if (TimerCheck.time<10 || (TimerCheck.JobGenerated/((double)TimerCheck.time/60))<20.0){  // Random Job time Generator when sufficient Job is generated.
			    		 				
				    		 		int BurstTime =BurstTimeGenerator.Generate(5,18); // Generate Random Job burst time.
				    		 		

				    		 		
				    		 		ProcessLists.add(new JobClass(TimerCheck.time,TimerCheck.time,0,null,BurstTime)); // Add Generated Job into the Queue.
				    		 		
				    		 		TimerCheck.JobGenerated=TimerCheck.JobGenerated+1; // Add the number of generated Jobs by 1.
				    		 		
	
			    		 		}	
			    		 		
			    		 		
			    		 		String PrintArray = "";
			    		 		
			    		 		System.out.print ("Queue("+ProcessLists.size()+") : ");
			    		 		
			    		 		int x=0;
			    		 		
			    		 		Iterator<JobClass> Iterator = ProcessLists.iterator();
			    				while (Iterator.hasNext()) {
			    					
			    					JobClass PrintQueue = Iterator.next();
			    					
			    					PrintArray = PrintArray +"["+PrintQueue.getjobID()+"="+PrintQueue.getBurstTime()+"("+PrintQueue.getProcessRound()+")] , " ; // Print Queue information.
			    			
			    				}
			    				
			    				System.out.print (PrintArray);
			    				label2.setText("Queue("+ProcessLists.size()+") :"+PrintArray); // Display Queue information in JPanel.

			    				
			    				
			    				System.out.println("");
			    				
			    				// SERVER 1 CODING START
			    		 		
			    		 		if ( Server1Status==1 && (ProcessLists.isEmpty()==false)){ // Only use Server if Server 1 is available and the Queue is not empty
			    		 			
			    		 			Server1Status=0;	// Set Server 1 as unavailable as a Job is assigned to it.
			    		 			
				    		 		JobClass Print = ProcessLists.peek(); // Obtain Job information from the first element of the ArrayLists.
				    		 				
				    		 		int JobServer1BurstTime = Print.getBurstTime(); // Obtain the remaining burst time of the current Job assigned to Server 1.
				    		 		
				    		 		if (JobServer1BurstTime<=8){ // If the Job burst time is equal or less then eight, the server will serve the Job according to its burst time.
				    		 			
				    		 			JobServer1BurstTime=JobServer1BurstTime;
				    		 			JobServer.BurstTime=JobServer1BurstTime;
				    		 			
				    		 		}
				    		 		
				    		 		else {  // Else, it will be set to eight second as the limit per Job for one server is eight seconds.
				    		 			
				    		 			JobServer1BurstTime=8;
				    		 			JobServer.BurstTime=JobServer1BurstTime;
				    		 		}
				    		 		
				    		 		ReleaseTime  = (JobServer1BurstTime)+TimerCheck.time; // Determine when Server 1 will release the current assigned Job.
				    		 		
				    		 		JobServer.JobID=Print; // Obtain the current assigned Job information and send to Server 1 class (JobServer).
				    		 		
				    		 		ProcessLists.poll(); // Remove the Job from the Queue.
				    		 		
				    		 		JobServer.ServerStatus=1; // State that Server 1 have a Job assigned.
				    		 		
				    		 		System.out.println("");
				    		 		
				    		 		TimerCheck.Server1Remain=JobServer1BurstTime; // Send information to the System Clock about Server 1 remaining serve time for current Job.
				    		 	
				    		 		System.out.println("Server 1 Accepting and Processing Job ID: "+Print.getjobID()+ " Release Time: "+ReleaseTime); 
				    		 		
				    		 		//Print Information about Server 1 status.
				    		 		
					    			label4.setText("Server 1 Accepting and Processing Job ID: "+Print.getjobID()+ " Release Time: "+ReleaseTime); // JPanel displays
					    			
					    			label5.setText("");
			    		 		
			    		 		}
			    		 		
			    		 		else { // Execute if Server 1 is unavailable.
			    		 			
			    		 			if (ProcessLists.isEmpty()==false){ // Execute if the Queue is not empty.
			    		 			
				    		 			System.out.println("");
				    		 			
				    		 			System.out.println("Server 1 Busy: Serving JobID: "+JobServer.JobID.getjobID()); // Print Server 1 current status.
				    		 			
				    		 			label4.setText("Server 1 Busy: Serving JobID: "+JobServer.JobID.getjobID());
				    		 			
				    		 			TimerCheck.Server1Remain=TimerCheck.Server1Remain-1; // Minus one second from Server 1 remaining serve time for its current Job.
			    		 			
				    		 			if (TimerCheck.Server1Remain>0){ // Execute if server one still have serve time for its current Job.
			    		 			
				    		 				System.out.println("Remaining Time for Server 1: "+(TimerCheck.Server1Remain)); // Print remaining Server 1 serve time for current Job.
				    		 				
				    		 				label5.setText("Remaining Time for Server 1: "+(TimerCheck.Server1Remain));
			    		 			
				    		 			}
			    		 			}
			    		 		}
			    		 		
			    		 		if (TimerCheck.time>=ReleaseTime && JobServer.ServerStatus==1 ) { // Execute if the System Clock matches the current time.
				    		 		
			    		 		JobServer.JobID.increaseProcessRound(); // Increase the Job's number of time processed by 1.
			    		 			
			    		 		System.out.println("Server 1 Releasing JobID: "+JobServer.JobID.getjobID()); // Print information about Server one completing its serve time.
			    		 			
			    		 		label5.setText("Server 1 Releasing JobID: "+JobServer.JobID.getjobID());
			    		 			
				    		 	Server1Status=1; // Change Server 1 to be available to accept new Job.
				    		 		
				    		 	if(JobServer.JobID.getBurstTime()-JobServer.BurstTime==0){ // Execute when the Job have no more burst time.
				    		 			
				    		 		JobServer.JobDone=JobServer.JobDone+1; // Add to the completed task record by 1.
				    		 			
				    		 		System.out.println("Server 1 Job Completed !("+JobServer.JobDone+")"); // Display that Server 1 had completed a job.
				    		 			
				    		 		label6.setText("Server 1 Job Completed !("+JobServer.JobDone+")");
				    		 		
				    		 		JobServer.JobIDdone=JobServer.JobIDdone+"["+JobServer.JobID.getjobID()+"],";
	
				    		 		if (JobServer.JobID.getProcessRound()==1){              // Determine how many times the Job needs to be processed before it is completed.
				    		 			JobServer.JobDone1Pass=JobServer.JobDone1Pass+1;    // Stores the information in Server 1 class (JobServer).
				    		 		}
				    		 			
				    		 		if (JobServer.JobID.getProcessRound()==2){
				    		 			JobServer.JobDone2Pass=JobServer.JobDone2Pass+1;
				    		 		}
				    		 			
				    		 		if (JobServer.JobID.getProcessRound()==3){
				    		 			JobServer.JobDone3Pass=JobServer.JobDone3Pass+1;
				    		 		}
	
				    		 		JobServer.JobID=null; // Remove all information of the Job from Server 1 class (JobServer).
				    		 	}
				    		 		
				    		 	else{ // Execute when the Job have more burst time.
				    		 			
				    		 		JobServer.JobID.setBurstTime(JobServer.JobID.getBurstTime()-JobServer.BurstTime); // Calculate Job remaining burst time.
				    		 		
				    		 		ProcessLists.add(JobServer.JobID); // Add back the Job into the Queue.
				    		 		
				    		 		JobServer.ServerStatus=0; // State that Server 1 have no more Job assigned.
				    		 		
				    		 		}
				    		 	}
				    		 		
			    		 			
				    		 	System.out.println("");
								
				    		 	// SERVER 1 CODING END.
			    		 		
				    		 	// SERVER 2 CODING START (Similar to Server 1 coding with variable changes.)
	    		 				
				    		 	if ( Server2Status==1 && (ProcessLists.isEmpty()==false) ){
				    		 			
				    		 		Server2Status=0;	
				    		 			
					    		 	JobClass Print2 = ProcessLists.peek();
					    		 				
					    		 	int JobServer2BurstTime = Print2.getBurstTime();
					    		 		
					    		 	if (JobServer2BurstTime<=8){
					    		 			
					    		 		JobServer2BurstTime=JobServer2BurstTime;
					    		 		JobServer2.BurstTime=JobServer2BurstTime;
					    		 			
					    		 	}
					    		 		
					    		 	else {
					    		 			
					    		 		JobServer2BurstTime=8;
					    		 		JobServer2.BurstTime=JobServer2BurstTime;
					    		 	}
					    		 		

					    		 ReleaseTime2  = (JobServer2BurstTime)+TimerCheck.time;

					    		 		
					    		 JobServer2.JobID=Print2;
					    		 		
					    		 ProcessLists.poll();
					    		 		
					    		 JobServer2.ServerStatus2=1;
					    		 		
					    		 System.out.println("");
					    		 		
					    		 TimerCheck.Server2Remain=JobServer2BurstTime;
					    		 		
					    		 System.out.println("Server 2 Accepting and Processing Job ID: "+Print2.getjobID()+ " Release Time: "+ReleaseTime2);
					    		 		
					    		 	label8.setText("Server 2 Accepting and Processing Job ID: "+Print2.getjobID()+ " Release Time: "+ReleaseTime2);
					    		 	label9.setText("");		
					    		 	
				    		 	}
				    		 		
				    		 	else {
				    		 			
				    		 		if (ProcessLists.isEmpty()==false){

					    		 		System.out.println("Server 2 Busy: Serving JobID: "+JobServer2.JobID.getjobID());
					    		 			
					    		 		label8.setText("Server 2 Busy: Serving JobID: "+JobServer2.JobID.getjobID());
					    		 			
					    		 		TimerCheck.Server2Remain=TimerCheck.Server2Remain-1;
	
					    		 		if (TimerCheck.Server2Remain>0){
		
					    		 			System.out.println("Remaining Time for Server 2 : "+(TimerCheck.Server2Remain));
					    		 			label9.setText("Remaining Time for Server 2 : "+(TimerCheck.Server2Remain));
				    		 			
					    		 		}
				    		 		}
				    		 	}
				    		 		
				    		 	if (TimerCheck.time>=ReleaseTime2 && JobServer2.ServerStatus2==1 ) {
					    		 		
				    		 		JobServer2.JobID.increaseProcessRound();
				    		 			
				    		 		System.out.println("Server 2 Releasing JobID: "+JobServer2.JobID.getjobID());
				    		 		
				    		 		label9.setText("Server 2 Releasing JobID: "+JobServer2.JobID.getjobID());
				    		 			
					    		 	Server2Status=1;
					    		 		
					    		 	if(JobServer2.JobID.getBurstTime()-JobServer2.BurstTime==0){
					    		 			
					    		 		JobServer2.JobDone=JobServer2.JobDone+1;
					    		 			
					    		 		System.out.println("Server 2 Job Completed !("+JobServer2.JobDone+")");
					    		 			
					    		 		label10.setText("Server 2 Job Completed !("+JobServer2.JobDone+")");
					    		 		
					    		 		JobServer2.JobIDdone=JobServer2.JobIDdone+"["+JobServer2.JobID.getjobID()+"],";
		
					    		 		if (JobServer2.JobID.getProcessRound()==1){
					    		 			JobServer2.JobDone1Pass=JobServer2.JobDone1Pass+1;
					    		 		}
					    		 			
					    		 		if (JobServer2.JobID.getProcessRound()==2){
					    		 			JobServer2.JobDone2Pass=JobServer2.JobDone2Pass+1;
					    		 		}
					    		 			
					    		 		if (JobServer2.JobID.getProcessRound()==3){
					    		 			JobServer2.JobDone3Pass=JobServer2.JobDone3Pass+1;
					    		 		}

					    		 		JobServer2.JobID=null;
					    		 	}
					    		 		
					    		 else{

					    		 	JobServer2.JobID.setBurstTime(JobServer2.JobID.getBurstTime()-JobServer2.BurstTime);
	
					    		 	ProcessLists.add(JobServer2.JobID);
					    		 		
					    		 	JobServer2.ServerStatus2=0;
					    		 	
					    		 }
					    		}
					    		 		
					    		 System.out.println("");
									
					    		 // SERVER 2 CODING END.
					    			
					    		 // Report Coding.	
				    		 		
			    		 		label13.setText("--------------------------------------------------------------------------------------------------");
			    		 		label14.setText("Report:");
			    		 		label15.setText("");
			    		 		
				        		System.out.println("");
				        		
				        		System.out.println("Job Generated : "+ (TimerCheck.JobGenerated ));
				        		label16.setText("Job Generated : "+ (TimerCheck.JobGenerated ));
				        		label17.setText("");
				        		
				        		System.out.println("");
				        		
				        		System.out.println("Average Job arrived per minute : "+ TimerCheck.JobGenerated/((double)TimerCheck.time/60));
				        		label18.setText("Average Job arrived per minute : "+ TimerCheck.JobGenerated/((double)TimerCheck.time/60));
				        		label19.setText("");
				        		
				        		System.out.println("");
				        		
				        		System.out.println("Job Completed : "+ (JobServer.JobDone+JobServer2.JobDone)+ "(Server 1: "+JobServer.JobDone+", Server 2: "+JobServer2.JobDone+")");
				        		label20.setText("Job Completed : "+ (JobServer.JobDone+JobServer2.JobDone)+ "(Server 1: "+JobServer.JobDone+", Server 2: "+JobServer2.JobDone+")");
				        		label21.setText("");
				        		
				        		System.out.println("");
				        		
				        		double TotalJob = JobServer.JobDone+JobServer2.JobDone;
				        		double currentTime = TimerCheck.time/60;
				        		
				        		System.out.println("Average Job Completed per minute : "+ TotalJob/currentTime);
				        		label22.setText("Average Job Completed per minute : "+ TotalJob/currentTime);
				        		label23.setText("");
				        		
				        		System.out.println("");
				        		
				        		System.out.println("Jobs Completed with 1 Pass: "+ (JobServer.JobDone1Pass+JobServer2.JobDone1Pass));
				        		label24.setText("Jobs Completed with 1 Pass: "+ (JobServer.JobDone1Pass+JobServer2.JobDone1Pass));
				        		label25.setText("");
				        		
				        		System.out.println("");
				        		
				        		System.out.println("Jobs Completed with 2 Pass: "+ (JobServer.JobDone2Pass+JobServer2.JobDone2Pass));
				        		label26.setText("Jobs Completed with 2 Pass: "+ (JobServer.JobDone2Pass+JobServer2.JobDone2Pass));
				        		label27.setText("");
				        		
				        		System.out.println("");
				        		
				        		System.out.println("Jobs Completed with 3 Pass: "+ (JobServer.JobDone3Pass+JobServer2.JobDone3Pass));
				        		label28.setText("Jobs Completed with 3 Pass: "+ (JobServer.JobDone3Pass+JobServer2.JobDone3Pass));
				        		label29.setText("");
				        		
				        		System.out.println("");
				        		
				        		
				        		System.out.println("Server 1 Job Completed with 1 Pass: "+ JobServer.JobDone1Pass);
				        		label30.setText("Server 1 Job Completed with 1 Pass: "+ JobServer.JobDone1Pass);
				        		label31.setText("");
				        		
				        		System.out.println("");
				        		
				        		System.out.println("Server 1 Job Completed with 2 Pass: "+ JobServer.JobDone2Pass);
				        		label32.setText("Server 1 Job Completed with 2 Pass: "+ JobServer.JobDone2Pass);
				        		label33.setText("");
				        		
				        		System.out.println("");
				        		
				        		System.out.println("Server 1 Job Completed with 3 Pass: "+ JobServer.JobDone3Pass);
				        		label34.setText("Server 1 Job Completed with 3 Pass: "+ JobServer.JobDone3Pass);
				        		label35.setText("");
				        		
				        		System.out.println("");
				        		
				        		System.out.println("Server 2 Job Completed with 1 Pass: "+ JobServer2.JobDone1Pass);
				        		label36.setText("Server 2 Job Completed with 1 Pass: "+ JobServer2.JobDone1Pass);
				        		label37.setText("");
				        		
				        		System.out.println("");
				        		
				        		System.out.println("Server 2 Job Completed with 2 Pass: "+ JobServer2.JobDone2Pass);
				        		label38.setText("Server 2 Job Completed with 2 Pass: "+ JobServer2.JobDone2Pass);
				        		label39.setText("");
				        		
				        		System.out.println("");
				        		
				        		System.out.println("Server 2 Job Completed 3 Pass: "+ JobServer2.JobDone3Pass);
				        		label40.setText("Server 2 Job Completed 3 Pass: "+ JobServer2.JobDone3Pass);
				        		label41.setText("");
				        		
				        		System.out.println("Job ID(s) Completed by Server 1: "+ JobServer.JobIDdone);
				        		label42.setText("Job ID(s) Completed by Server 1: "+ JobServer.JobIDdone);
				        		label43.setText("");
				    		 	
				        		System.out.println("Job ID(s) Completed by Server 2: "+ JobServer2.JobIDdone);
				        		label44.setText("Job ID(s) Completed by Server 2: "+ JobServer2.JobIDdone);
				        		label45.setText("");
				        		
				        		System.out.println ("_________________________________________________________________________________________________________________");
				    		 	
				    		 	frame.setVisible(true);
				    		 	panel.repaint();

				    		 	if (TimerCheck.time >=TimerCheck.duration ||  TimerCheck.JobGenerated==(JobServer.JobDone+JobServer2.JobDone )) { // End program when time limit reached or all Jobs are completed.
					        		
				    		 		if (TimerCheck.time >=TimerCheck.duration){
				    		 			
				    		 			System.out.println("");
				    		 			System.out.println("Program Terminated [TIME LIMIT REACHED]: All unfinished Job(s) will be stopped.");
				    		 			label11.setText("Program Terminated [TIME LIMIT REACHED]: All unfinished Job(s) will be stopped.");
				    		 			label12.setText("");
				    		 			
				    		 		}
				    		 		
				    		 		else {
				    		 			
				    		 			System.out.println("");
				    		 			System.out.println("Program Terminated: All Jobs finished.");
				    		 			label11.setText("Program Terminated: All Jobs finished.");
				    		 			label12.setText("");
				    		 			
				    		 		}
				    		 		

					        		
					        		
					        		SystemClock.cancel();

					        	}
					        	
					        }
					    },
			0,1000); // Execute the entire program loop one timer per one second. (1000 = 1 second)
				
		}
			        		        	        	
}



