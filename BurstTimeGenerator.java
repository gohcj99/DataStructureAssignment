
public class BurstTimeGenerator {

	//Method to randomly generate Job burst time
	public static int Generate(int min, int max) 
	{
	   int range = (max - min) + 1;     
	   return (int)(Math.random() * range) + min;
	}
	
	
}
