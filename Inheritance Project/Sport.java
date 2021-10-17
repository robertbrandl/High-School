//Robert Brandl
// 2/6/20
//Hierarchy: Hobby
public class Sport extends Hobby
{
	protected int numberOfAthletesTeam1, numberOfAthletesTeam2, team1Score, team2Score;
	public Sport(String name, boolean start, boolean finished, int athleteNum, int t1Score, int t2Score)
	{
		super (name, start, finished);
		numberOfAthletesTeam1 = athleteNum;
		numberOfAthletesTeam1 = athleteNum;
		team1Score = t1Score;
		team2Score = t2Score;
	}
	public String team1AddPoints(int addPoints)
	{
		team1Score += addPoints;
		return ("Team 1 now has " + team1Score + " point(s)");
	}
	public String team2AddPoints(int addPoints)
	{
		team2Score += addPoints;
		return ("Team 2 now has " + team2Score + " point(s)");
	}
	public String removeAthlete(int teamNum)
	{
		if (teamNum == 1)
		{
			numberOfAthletesTeam1--;
			if (numberOfAthletesTeam1 > 0)
			{
				return ("The number of athletes on team " + teamNum + " is now " + numberOfAthletesTeam1);
			}
			else
			{
				return ("Invalid number of athletes");
			}
		}
		else if (teamNum == 2)
		{
			numberOfAthletesTeam2--;
			if (numberOfAthletesTeam1 > 0)
			{
				return ("The number of athletes on team " + teamNum + " is now " + numberOfAthletesTeam2);
			}
			else
			{
				return ("Invalid number of athletes");
			}
		}
		else
		{
			return null;
		}

	}
	public String addAthlete(int teamNum)
	{
		if (teamNum == 1)
		{
			numberOfAthletesTeam1++;
			return ("The number of athletes for Team 1 is now " + numberOfAthletesTeam1);
		}
		else if (teamNum == 2)
		{
			numberOfAthletesTeam2++;
			return ("The number of athletes for Team 2 is now " + numberOfAthletesTeam2);
		}
		else
		{
			return null;
		}
	}
}
