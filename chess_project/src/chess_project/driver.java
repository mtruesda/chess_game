package chess_project;
import java.util.ArrayList;
import java.util.List;

public class driver {
	
	public static void main(String[] args) {
		Board GameBoard = new Board();
	}
	
	public static boolean posChecker(String pos) {
		String letter = Character.toString(pos.charAt(0));
		int num = -1;
		try {
			num = Integer.parseInt(pos.substring(1));
		} catch (Exception e) {
			return false;
		}
		ArrayList<String> chars = new ArrayList<String>(List.of("A","B","C","D","E","F","G","H"));
		
		if (pos.length() < 3 || !chars.contains(letter) || !(num > 0 && num < 9)) {
			return false;
		} else {
			return true;
		}
	}
	
}
