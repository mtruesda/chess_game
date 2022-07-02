package chess_project;

public class King implements Piece {

	String pos;
	
	public King(String pos) {
		if (driver.posChecker(pos)) {
			this.pos = pos;
		} else {
			throw new IllegalArgumentException();
		}
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
			
		}
		
		return false;
	}

}
