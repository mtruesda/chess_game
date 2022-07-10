package chess_project;

public interface Piece {

	String pos = "A01";

	public boolean move(String newPos);
	
	public boolean isValid(String newPos);
	
	public String toString();

	public String getPos();
	
}
