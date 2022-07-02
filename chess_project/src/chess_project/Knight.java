package chess_project;

public class Knight implements Piece {

	String pos;
	
	public Knight(String pos) {
		if (driver.posChecker(pos)) {
			this.pos = pos;
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

}
