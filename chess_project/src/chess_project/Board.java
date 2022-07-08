package chess_project;
import java.util.ArrayList;

public class Board {
	
	Piece[][] boardArray;
	
	public Board() {
		this.boardArray = new Piece[8][8];
		// Rooks
		this.boardArray[0][0] = new Rook("A01", "black");
		this.boardArray[7][7] = new Rook("A08", "white");
		this.boardArray[0][7] = new Rook("H01", "black");
		this.boardArray[7][0] = new Rook("H08", "white");
		// Knights
		this.boardArray[0][1] = new Knight("B01", "black");
		this.boardArray[7][1] = new Knight("B08", "white");
		this.boardArray[0][6] = new Knight("G01", "black");
		//
		
		// Bishops
		this.boardArray[0][2] = new Bishop("A03", "white", "black");
		
		// Kings
		// Queens
		
	}
	
	public String toString() {
		
		String string = "";
		
		// prints the board
		for (int i = 0; i < 8; i++) {
			
			for (int j = 0; j < 8; j++) {
				
				if (this.boardArray[i][j] instanceof Piece) {
					
					// add the piece to the board print statement
					string += this.boardArray[i][j].toString();
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
	
}
