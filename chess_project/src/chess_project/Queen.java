package chess_project;

public class Queen implements Piece {

	String pos;
	String color;
	
	public Queen(String pos, String color) {
		if (driver.posChecker(pos) && (color.equals("black") || color.equals("white"))) {
			this.pos = pos;
			this.color = color;
		} else {
			throw new IllegalArgumentException();
		}
	}
	
	@Override
	public boolean move(String newPos) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isValid(String newPos) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String getPos() {
		return this.pos;
	}
	
	@Override
	public String toString() {
		if (this.color.equals("black")) {
			return "QB";
		} else {
			return "QW";
		}
	}

}
