//Robert Brandl
// 2/6/20
//Hierarchy: Hobby
public class Chess extends Game
{
	protected boolean player1checkMate, player2checkMate;
	protected int numberOfPlayer1Pieces, numberOfPlayer2Pieces;
	public Chess (String name, boolean start, boolean finished, String player1Name, String player2Name, boolean tie, boolean p1checkMate, boolean p2checkMate, int numOfPlayer1Pieces, int numOfPlayer2Pieces)
	{
		super (name, start, finished, player1Name, player2Name, tie);
		player1checkMate = p1checkMate;
		player2checkMate = p2checkMate;
		numberOfPlayer1Pieces = numOfPlayer1Pieces;
		numberOfPlayer2Pieces = numOfPlayer2Pieces;
	}
	public String isCheckMate ()
	{
		if (player1checkMate == true && player2checkMate == false)
		{
			return super.determineWinner (false, true);
		}
		else if (player2checkMate == true && player1checkMate == false)
		{
			return super.determineWinner (true, false);
		}
		else
		{
			return null;
		}
	}
	public String player1LoseAPiece ()
	{
		numberOfPlayer1Pieces -= 1;
		if (numberOfPlayer1Pieces == 0)
		{
			return super.determineWinner (false, true);
		}
		else
		{
			return (super.player1Name + " now has " + numberOfPlayer1Pieces + " pieces");
		}
	}
	public String player2LoseAPiece ()
	{
		numberOfPlayer2Pieces -= 1;
		if (numberOfPlayer2Pieces == 0)
		{
			return super.determineWinner (true, false);
		}
		else
		{
			return (super.player2Name + " now has " + numberOfPlayer2Pieces + " pieces");
		}
	}
	public String movePiece(int playerNum)
	{
		if (playerNum == 1)
		{
			return (super.player1Name + " moved a piece!");
		}
		else if (playerNum == 2)
		{
			return (super.player2Name + " moved a piece!");
		}
		else
		{
			return null;
		}
	}
}
