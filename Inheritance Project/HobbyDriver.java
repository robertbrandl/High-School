//Robert Brandl
// 2/6/20
//Hierarchy: Hobby
public class HobbyDriver
{
	public static void main (String [] args)
	{
		Sport sport = new Sport("basketball", true, false, 11, 10, 23);
		Game game = new Game("puzzle", false, true, "John", "James", false);
		Soccer soccer = new Soccer("soccer", true, false, 11, 0, 0, 1, false, true);
		Football football = new Football("football", true, false, 46, 0, 7, 7, 3, true);
		Baseball baseball = new Baseball("baseball", true, false, 9, 0, 0, 1, 4, 1, false);
		Chess chess = new Chess ("chess", true, false, "Chris", "Amy", false, false, true, 12, 15);
		System.out.println(sport.removeAthlete(1) + "\n");
		System.out.println(game.quitGame() + "\n");
		System.out.println(soccer.givePenaltyKick("John Smith", 1) + "\n");
		System.out.println(football.callTimeOut() + "\n");
		System.out.println(baseball.inningEnd() + "\n");
		System.out.println(chess.player1LoseAPiece() + "\n");
		System.out.println(chess.movePiece(1) + "\n");
	}
}
