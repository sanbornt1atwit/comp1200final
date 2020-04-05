import java.util.Random;

public class comPlay {
	private static int[] played = new int[9];

	public static int compSelectEasy(boolean comTurn, int[] played) {
		Random r;
		int sel;
		r = new Random();
		do{
			sel = r.nextInt(0 - 8);
		}while(isTaken(sel) == true);
		played[sel] = 1;
		return sel;
	}

	
	
	public void addToPlayed(int selected) {
		played[selected] = 1;
	}

	
	
	
	public static boolean isTaken(int sel) {
		if(played[sel] == 1) {
			return true;
		}
		else {
			return false;
		}
	}
}
