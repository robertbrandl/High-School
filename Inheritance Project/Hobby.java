//Robert Brandl
// 2/6/20
//Hierarchy: Hobby
import java.util.Random;
public class Hobby
{
	protected String hobbyName;
	protected boolean activityStarted, activityFinished;
	protected Random r = new Random ();
	public Hobby (String name, boolean start, boolean finished)
	{
		hobbyName = name;
		activityStarted = start;
		activityFinished = finished;
	}
	public String changeHobbyName(String newName)
	{
		hobbyName = newName;
		return ("The new hobby name is " + hobbyName);
	}
	public String pickFrequency ()
	{
		int times = r.nextInt(5) + 1;
		return ("You participate in this hobby " + times + " per week");
	}
	public String beginActivity()
	{
		String status = "";
		int num = r.nextInt (2) + 1;
		if (num == 1)
		{
			activityStarted = true;
			activityFinished = false;
			status = "The activity has begun";
		}
		return status;
	}
	public String endActivity()
	{
		String status = "";
		int num = r.nextInt (2);
		if (num == 0)
		{
			activityFinished = true;
			activityStarted = false;
			status = "The activity has finished";
		}
		return status;
	}
}
