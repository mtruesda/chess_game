package chess_project;

public class Bishop implements Piece {

	String pos;
	String color;
	String teamColor;
	
	public Bishop(String pos, String color, String team) {
		if (driver.posChecker(pos) && (color.equals("white") || color.equals("black"))
				&& (team.equals("white") || team.equals("black"))) {
			this.pos = pos;
			this.color = color;
			this.teamColor = team;
			
			if (!this.colorGood(pos)) {
				throw new IllegalArgumentException();
			}
			
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

	public boolean colorGood(String newPos) {
		if (driver.posChecker(newPos)) {
			
			String first = Character.toString(newPos.charAt(0));
			int num = Integer.parseInt(newPos.substring(1));
			
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
					&& num % 2 == 1 && this.color.equals("black")) {
				// System.out.println("Black with second letter odd number good");
				return true;
			} else {
				return false;
			}
			
			
		}
		
		return false;
	}
	
	@Override
	public boolean isValid(String newPos) {
		if (driver.posChecker(newPos)) {
			// obtain values from the new position
			String first = Character.toString(newPos.charAt(0));
			int num = Integer.parseInt(newPos.substring(1));
			
			// need to find a way to identify if the diagonal movement is valid.
			String[] values = new String[] {"A","B","C","D","E","F","G","H"};
			int[] distances = returnDistance(first);
			
			System.out.println(distances);
			
			
		}
		
		return false;
	}
	
	public int[] returnDistance(String first) {
		
		String[] values = new String[] {"A","B","C","D","E","F","G","H"};
		int[] returner = new int[8];
		int firstIndex = -1;
		
		for (int i = 0; i < 8; i++) {
			if (values[i].equals(first)) {
				firstIndex = i;
			}
		}
		
		returner[firstIndex] = 0;
		
		if(firstIndex != 7) {
			int counter = 1;
			for (int i = firstIndex + 1; i < 8-firstIndex-1; i++) {
				returner[i] = counter;
				counter++;
			}
		}
		
		if(firstIndex != 0) {
			int counter = 1;
			for (int i = firstIndex - 1; i > 0 + firstIndex; i--) {
				returner[i] = counter;
				counter++;
			}
		}
		
		return returner;
		
	}
	
	@Override
	public String toString() {
		if (this.teamColor.equals("black")) {
			return "BB";
		} else {
			return "BW";
		}
	}

	@Override
	public String getPos() {
		return this.pos;
	}

}
