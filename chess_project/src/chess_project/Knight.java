package chess_project;

public class Knight implements Piece {

	String pos;
	String color;
	
	public Knight(String pos, String color) {
		if (driver.posChecker(pos) && (color.equals("black") || color.equals("white"))) {
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

}
