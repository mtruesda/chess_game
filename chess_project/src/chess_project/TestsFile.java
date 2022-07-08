package chess_project;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestsFile {

	@Test
	void testPosFunction() {
		// System.out.println("Testing Letters - K08");
		assertFalse(driver.posChecker("K08"));
		// System.out.println("Checking True - A03");
		assertTrue(driver.posChecker("A03"));
		// System.out.println("Testing bad numbers - A12");
		assertFalse(driver.posChecker("A12"));
		// System.out.println("Testing bad numbers - A00");
		assertFalse(driver.posChecker("A00"));
		// System.out.println("Testing bad length - A1");
		assertFalse(driver.posChecker("A1"));
	}

	@Test
	void testRookMoves() {
		//System.out.println("Testing creation");
		Rook rook = new Rook("A01", "black");
		//System.out.println("Testing Move");
		assertTrue(rook.move("A08"));
		// new current pos is A08
		// System.out.println("Testing Bad Move");
		assertFalse(rook.move("B04"));
	}
	
	@Test
	void testBishopMoves() {
		System.out.println("Testing white");
		Bishop bishopw = new Bishop("A01", "white", "black");
		System.out.println("Testing move white proper");
		System.out.println("Testing black");
		Bishop bishopb = new Bishop("A02", "black", "black");
		System.out.println("Testing move black improper");
		
	}
	
	@Test
	void testKnightMoves() {
		
	}
	
	@Test
	void testKingMoves() {
		
	}
	
	@Test
	void testQueenMoves() {
		
	}
	
	@Test
	void testBoard() {
		Board board = new Board();
		System.out.println(board.toString());
	}
}
