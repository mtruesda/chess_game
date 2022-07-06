package chess_project;

public class Bishop implements Piece {

	String pos;
	String color;
	
	public Bishop(String pos, String color) {
		if (driver.posChecker(pos) && (color.equals("white") || color.equals("black")) && this.isValid(pos)) {
			this.pos = pos;
			this.color = color;
			System.out.println("Color: ");
			System.out.println(this.color);
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
			
			String first = Character.toString(newPos.charAt(0));
			int num = Integer.parseInt(newPos.substring(1));
			
			System.out.println(this.color);
			
			if ( (first.equals("A") || first.equals("C") || first.equals("E") || first.equals("G"))
					&& (num % 2 == 1) && this.color.equals("white")) {
				// System.out.println("White with first letter odd number good");
				return true;
			} else if ( (first.equals("B") || first.equals("D") || first.equals("F") || first.equals("H"))
					&& num % 2 == 0 && this.color.equals("white")) {
				// System.out.println("White with second letter even number good");
				return true;
			} else if ( (first.equals("A") || first.equals("C") || first.equals("E") || first.equals("G"))
					&& num % 2 == 0 && this.color.equals("black")) {
				// System.out.println("Black with first letter odd number good");
				return true;
			} else if ( (first.equals("B") || first.equals("D") || first.equals("F") || first.equals("H"))
					&& num % 2 == 1 && this.color.equals("white")) {
				// System.out.println("Black with second letter odd number good");
				return true;
			} else {
				return false;
			}
			
			
		}
		
		return false;
	}

}
