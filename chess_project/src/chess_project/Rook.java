package chess_project;
// completed ROOK

public class Rook implements Piece {
	
	String pos;
	
	public Rook(String pos) {
		if (!driver.posChecker(pos)) {
			throw new IllegalArgumentException();
		}
		
		this.pos = pos;
	}

	@Override
	public boolean move(String newPos) {
		if (this.isValid(newPos)) {
			this.pos = newPos;
			return true;
		}
		
		return false;
	}

	@Override
	public boolean isValid(String newPos) {
		if (driver.posChecker(newPos)) {
			String newLetter = Character.toString(newPos.charAt(0));
			String letter = Character.toString(this.pos.charAt(0));
			int newNum = Integer.parseInt(newPos.substring(1));
			int num = Integer.parseInt(this.pos.substring(1));
			
			if ((newNum == num && !newLetter.equals(letter)) || 
					(newLetter.equals(letter) && newNum != num)) {
				return true;
			}
		}
		
		
		return false;
	}
	
}
