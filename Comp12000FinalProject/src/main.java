
public class main extends gameDisplay{
	public static boolean xTurn = true;
	public static String winner;
	private static int[] played = new int[9];
	public int topL = played[0];
	public int topM = played[1];
	public int topR = played[2];
	public int midL = played[3];
	public int midM = played[4];
	public int midR = played[5];
	public int botL = played[6];
	public int botM = played[7];
	public int botR = played[8];
	
	public static void addToPlayed(int place, boolean xTurn) {
		if(xTurn)
			played[place] = 1;
		else
			played[place] = 2;
	}
	public static boolean canBePlayed(int place) {
		if(played[place] > 0)
			return false;
		return true;
	}
	public static boolean hasWon() {
		if(played[0]!=0||played[1]!=0||played[2]!=0||played[3]!=0||played[4]!=0||played[5]!=0||played[6]!=0||played[7]!=0||played[8]!=0) {
			if(played[0] == played[1] && played[1] == played[2]&& played[2]!=0) {
				if(xTurn)
					winner = "X";
				else
					winner = "Y";
				return true;
			}else if(played[3] == played[4] && played[3] == played[5]&& played[3]!=0){
				if(xTurn)
					winner = "X";
				else
					winner = "Y";
				return true;
			}else if(played[6] == played[7] && played[7] == played[8]&& played[6]!=0){
				if(xTurn)
					winner = "X";
				else
					winner = "Y";
				return true;
			}else if(played[0] == played[3] && played[3] == played[6]&& played[0]!=0){
				if(xTurn)
					winner = "X";
				else
					winner = "Y";
				return true;
			}else if(played[1] == played[4] && played[4] == played[7]&& played[4]!=0){
				if(xTurn)
					winner = "X";
				else
					winner = "Y";
				return true;
			}else if(played[2] == played[5] && played[5] == played[8]&& played[5]!=0){
				if(xTurn)
					winner = "X";
				else
					winner = "Y";
				return true;
			}else if(played[0] == played[4] && played[4] == played[8]&& played[4]!=0){
				if(xTurn)
					winner = "X";
				else
					winner = "Y";
				return true;
			}else if(played[2] == played[4] && played[4] == played[6] && played[2]!=0){
				if(xTurn)
					winner = "X";
				else
					winner = "Y";
				return true;
			}else {
				return false;
			}
		}else {
			return false;
		}
	}
}

