//Robert Brandl
// 2/6/20
//Hierarchy: Hobby
public class Football extends Sport
{
	protected int touchdown, fieldGoal;
	protected boolean timeOut;
	public Football (String name, boolean start, boolean finished, int athleteNum, int t1Score, int t2Score, int tD, int fG, boolean timeO)
	{
		super (name, start, finished, athleteNum, t1Score, t2Score);
		touchdown = tD;
		fieldGoal = fG;
		timeOut = timeO;
	}
	public String scoreTouchdown (int teamNum)
	{
		if (teamNum == 1)
		{
			super.team1AddPoints (touchdown);
			return ("Team 1 scored a touchdown");
		}
		else if (teamNum == 2)
		{
			super.team2AddPoints (touchdown);
			return ("Team 2 scored a touchdown");
		}
		else
		{
			return ("No touchdown awarded");
		}
	}
	public String scoreFieldGoal (int teamNum)
	{
		if (teamNum == 1)
		{
			super.team1AddPoints (fieldGoal);
			return ("Team 1 scored got a field goal");
		}
		else if (teamNum == 2)
		{
			super.team2AddPoints (fieldGoal);
			return ("Team 2 scored a field goal");
		}
		else
		{
			return ("No field goal awarded");
		}
	}
	public String callTimeOut ()
	{
		if (timeOut == true)
		{
			return ("A timeout has been called");
		}
		else
		{
			return null;
		}
	}
}