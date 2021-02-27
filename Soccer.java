//Robert Brandl
// 2/6/20
//Hierarchy: Hobby
import java.util.Random;
public class Soccer extends Sport
{
	protected int goal;
	protected boolean redCard, penaltyKick;
	protected Random r = new Random ();
	public Soccer (String name, boolean start, boolean finished, int athleteNum, int t1Score, int t2Score, int goalPoint, boolean redCardStatus, boolean penKick)
	{
		super (name, start, finished, athleteNum, t1Score, t2Score);
		goal = goalPoint;
		redCard = redCardStatus;
		penaltyKick = penKick;
	}
	public String team1ScoreGoal ()
	{
		super.team1AddPoints (goal);
		return ("Team 1 scored a goal! They now have " + super.team1Score + " points");
	}
	public String team2ScoreGoal ()
	{
		super.team2AddPoints (goal);
		return ("Team 2 scored a goal! They now have " + super.team2Score + " points");
	}
	public String giveRedCard(String playerName, int teamNum)
	{
		if (redCard == true)
		{
			super.removeAthlete(teamNum);
			return (playerName + " received a red card for the foul");
		}
		else
		{
			return (playerName + " did not receive a redCard");
		}
	}
	public String givePenaltyKick(String playerName, int playerTeamNum)
	{
		String result = "";
		int rand = r.nextInt(2);
		if (penaltyKick == true)
		{
			result = playerName + " got a penalty kick.";
			if (rand == 0)
			{
				result += " "+ playerName + " scored!";
				if (playerTeamNum == 1)
				{
					result = result + ("\n" + super.team1AddPoints (goal));
				}
				else if (playerTeamNum == 2)
				{
					result = result + ("\n" + super.team2AddPoints (goal));
				}
			}
			else
			{
				result += " "+ playerName + " did not score";
			}
		}
		else
		{
			result = playerName + " did not get a penalty kick";
		}
		return result;
	}
}