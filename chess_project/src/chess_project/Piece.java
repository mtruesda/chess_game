package chess_project;

public interface Piece {

	public boolean move(String newPos);
	
	public boolean isValid(String newPos);
	
	public String toString();
	
}
