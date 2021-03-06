package chess_project;

public class King implements Piece {

	String pos;
	String color;
	
	public King(String pos, String color) {
		if (driver.posChecker(pos) && (color.equals("white") || color.equals("black"))) {
			this.pos = pos;
			this.color = color;
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
	
	@Override
	public String toString() {
		if (this.color.equals("black")) {
			return "KB";
		} else {
			return "KW";
		}
	}

	@Override
	public String getPos() {
		return this.pos;
	}

}
