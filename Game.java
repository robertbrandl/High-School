//Robert Brandl
// 2/6/20
//Hierarchy: Hobby
import java.util.Random;
public class Game extends Hobby
{
	protected String player1Name, player2Name, winningPlayer;
	protected boolean tie;
	protected Random r = new Random ();
	public Game(String name, boolean start, boolean finished, String p1Name, String p2Name, boolean tied)
	{
		super (name, start, finished);
		player1Name = p1Name;
		player2Name = p2Name;
		tie = tied;
	}
	public String determineWinner(int p1Points, int p2Points)
	{
		if (p1Points > p2Points)
		{
			winningPlayer = player1Name;
			return ("The winner is " + winningPlayer);
		}
		else if (p2Points > p1Points)
		{
			winningPlayer = player2Name;
			return ("The winner is " + winningPlayer);
		}
		else
		{
			winningPlayer = tieGame();
			return ("The winner is " + winningPlayer);
		}
	}
	public String determineWinner (boolean p1Status, boolean p2Status)
	{
		if (p1Status == true && p2Status == false)
		{
			winningPlayer = player1Name;
			return ("The winner is " + winningPlayer);
		}
		else if (p2Status == true && p1Status == false)
		{
			winningPlayer = player2Name;
			return ("The winner is " + winningPlayer);
		}
		else
		{
			winningPlayer = tieGame();
			return ("The winner is " + winningPlayer);
		}
	}
	public String tieGame()
	{
		int num = r.nextInt (2);
		if (num == 0)
		{
			return player1Name;
		}
		else
		{
			return player2Name;
		}
	}
	public String quitGame()
	{
		String end = super.endActivity();
		if (end.equals(""))
		{
			end = "The game is not over yet!";
		}
		return end;
	}
}