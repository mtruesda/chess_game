package chess_project;

public class Pawn implements Piece {

	String pos;
	String color;
	boolean started;
	
	public Pawn(String pos, String color) {
		if (driver.posChecker(pos) && (color.equals("white") || color.equals("black"))) {
			this.pos = pos;
			this.color = color;
			this.started = false;
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
		// TODO Auto-generated method stub
		return this.pos;
	}

	@Override
	public String toString() {
		if (this.color.equals("black")) {
			return "PB";
		} else {
			return "PW";
		}
	}
	
}
