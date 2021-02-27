//Robert Brandl
// 2/6/20
//Hierarchy: Hobby
public class Baseball extends Sport
{
	protected int homerun, grandSlam, numberOfOuts;
	protected boolean inningEnd;
	public Baseball (String name, boolean start, boolean finished, int athleteNum, int t1Score, int t2Score, int homeR, int gSlam, int numOfOuts, boolean innEnd)
	{
		super (name, start, finished, athleteNum, t1Score, t2Score);
		homerun = homeR;
		grandSlam = gSlam;
		numberOfOuts = numOfOuts;
		inningEnd = innEnd;
	}
	public String inningEnd ()
	{
		if (inningEnd == true || numberOfOuts == 3)
		{
			return ("The inning has ended!");
		}
		else
		{
			return ("The inning is still going");
		}
	}
	public String hitHomeRun (int playerAtBat, int playerAtBatTeamNumber)
	{
		String message = "";
		if (playerAtBatTeamNumber == 1)
		{
			message = playerAtBat + " hit a homerun!";
			super.team1AddPoints(homerun);
		}
		else if (playerAtBatTeamNumber == 2)
		{
			message = playerAtBat + " hit a homerun!";
			super.team2AddPoints(homerun);
		}
		else
		{
			message = playerAtBat + " fouled the ball!";
		}
		return message;
	}
	public String hitGrandSlam(int playerAtBat, int playerAtBatTeamNumber)
	{
		String message = "";
		if (playerAtBatTeamNumber == 1)
		{
			message = playerAtBat + " hit a grand slam!";
			super.team1AddPoints(grandSlam);
		}
		else if (playerAtBatTeamNumber == 2)
		{
			message = playerAtBat + " hit a grand slam!";
			super.team2AddPoints(grandSlam);
		}
		else
		{
			message = playerAtBat + " fouled the ball!";
		}
		return message;
	}
}