package chess_project;
import java.util.ArrayList;

public class Board {
	
	Piece[][] boardArray;
	ArrayList<Piece> whites;
	ArrayList<Piece> blacks;
	
	public Board() {
		this.boardArray = new Piece[8][8];
		this.whites = new ArrayList<Piece>();
		this.blacks = new ArrayList<Piece>();
		
		// blacks
		this.blacks.add(new Rook("A01", "black"));
		this.blacks.add(new Knight("B01", "black"));
		this.blacks.add(new Bishop("C01", "white", "black"));
		this.blacks.add(new Queen("D01", "black"));
		this.blacks.add(new King("E01", "black"));
		this.blacks.add(new Bishop("F01", "black", "black"));
		this.blacks.add(new Knight("G01", "black"));
		this.blacks.add(new Rook("H01", "black"));
		// Pawns
		this.blacks.add(new Pawn("A02", "black"));
		this.blacks.add(new Pawn("B02", "black"));
		this.blacks.add(new Pawn("C02", "black"));
		this.blacks.add(new Pawn("D02", "black"));
		this.blacks.add(new Pawn("E02", "black"));
		this.blacks.add(new Pawn("F02", "black"));
		this.blacks.add(new Pawn("G02", "black"));
		this.blacks.add(new Pawn("H02", "black"));
		
		// whites
		this.whites.add(new Rook("A08", "white"));
		this.whites.add(new Knight("B08", "white"));
		this.whites.add(new Bishop("C08", "black", "white"));
		this.whites.add(new Queen("D08", "white"));
		this.whites.add(new King("E08", "white"));
		this.whites.add(new Bishop("F08", "white", "white"));
		this.whites.add(new Knight("G08", "white"));
		this.whites.add(new Rook("H08", "white"));
		// Pawns
		this.whites.add(new Pawn("A07", "white"));
		this.whites.add(new Pawn("B07", "white"));
		this.whites.add(new Pawn("C07", "white"));
		this.whites.add(new Pawn("D07", "white"));
		this.whites.add(new Pawn("E07", "white"));
		this.whites.add(new Pawn("F07", "white"));
		this.whites.add(new Pawn("G07", "white"));
		this.whites.add(new Pawn("H07", "white"));
		
		// update the board
		this.updateBoard();
		
	}
	
	public void updateBoard() {
		int[] holder;
		
		for (Piece piece : this.blacks) {
			if (piece != null) {
				holder = this.getArray(piece);
				this.boardArray[holder[0]][holder[1]] = piece;
			}
		}
		
		for (Piece piece : this.whites) {
			if (piece != null) {
				holder = this.getArray(piece);
				this.boardArray[holder[0]][holder[1]] = piece;
			}
		}
		
		
	}
	
	public String toString() {
		
		String string = "-- Printing Board --\n";
		
		// prints the board
		for (int i = 0; i < 8; i++) {
			
			for (int j = 0; j < 8; j++) {
				
				if (this.boardArray[j][i] instanceof Piece) {
					
					// add the piece to the board print statement
					string += this.boardArray[j][i].toString();
					string += " ";
					
				} else {
					
					// add an empty space
					string += "-- ";
					
				}
				
			}
			
			// add a newline
			string += "\n";
			
		}
		
		return string;
		
	}
	
	public int[] getArray(Piece piece) {
		int[] array = new int[2];
		String[] values = new String[] {"A","B","C","D","E","F","G","H"};
		
		String pos = piece.getPos();
		
		String first = Character.toString(pos.charAt(0));
		array[1] = Integer.parseInt(pos.substring(1)) - 1;
		
		for (int i = 0; i < 8; i++) {
			if (values[i].equals(first)) {
				array[0] = i;
				return array;
			}
		}
		
		return array;
		
	}
	
}
