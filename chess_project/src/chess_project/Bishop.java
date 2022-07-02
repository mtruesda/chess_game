package chess_project;

public class Bishop implements Piece {

	String pos; 
	
	public Bishop(String pos) {
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
		String[] chars = new String[]{ "A","B","C","D","E","F","G","H" };
		
		if (driver.posChecker(newPos)) {
			
		}
	}

}
